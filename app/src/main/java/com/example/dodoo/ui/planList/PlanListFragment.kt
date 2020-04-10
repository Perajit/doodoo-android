package com.example.dodoo.ui.planList

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.dodoo.R
import com.example.dodoo.databinding.PlanListFragmentBinding
import kotlinx.android.synthetic.main.plan_list_fragment.*

class PlanListFragment : Fragment() {

    companion object {
        fun newInstance() = PlanListFragment()
    }

    private lateinit var viewModel: PlanListViewModel
    private lateinit var binding: PlanListFragmentBinding

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

        initAction()

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, PlanListViewModelFactory()).get(PlanListViewModel::class.java)
        initPlanList()
    }

    private fun initPlanList() {
        viewModel.planList.observe(viewLifecycleOwner, Observer { list ->
            Log.d("PlanListFragment", list.toString())
        })
    }

    private fun initAction() {
        binding.addPlanButton.setOnClickListener {
            binding.root.findNavController().navigate(R.id.action_mainFragment_to_planFragment)
        }
    }

}
