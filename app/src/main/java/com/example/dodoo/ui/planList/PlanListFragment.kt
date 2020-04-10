package com.example.dodoo.ui.planList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dodoo.R
import com.example.dodoo.databinding.PlanListFragmentBinding

class PlanListFragment : Fragment() {

    private val viewModel: PlanListViewModel by viewModels { PlanListViewModelFactory() }
    private lateinit var binding: PlanListFragmentBinding
    private val planListViewAdapter: PlanListViewAdapter by lazy { PlanListViewAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate<PlanListFragmentBinding>(
            inflater,
            R.layout.plan_list_fragment,
            container,
            false
        )

        initPlanList()
        initAction()

        return binding.root
    }

    private fun initPlanList() {
        binding.planListView.apply {
            adapter = planListViewAdapter
            layoutManager = LinearLayoutManager(this.context)
        }

        viewModel.planList.observe(viewLifecycleOwner, Observer { list ->
            planListViewAdapter.list = list
        })
    }

    private fun initAction() {
        binding.addPlanButton.setOnClickListener {
            binding.root.findNavController().navigate(R.id.action_mainFragment_to_planFragment)
        }
    }

}
