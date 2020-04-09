package com.example.dodoo.ui.planList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.dodoo.R
import com.example.dodoo.databinding.PlanListFragmentBinding

class PlanListFragment : Fragment() {

    companion object {
        fun newInstance() = PlanListFragment()
    }

    private lateinit var viewModel: PlanListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<PlanListFragmentBinding>(
            inflater,
            R.layout.plan_list_fragment,
            container,
            false
        )

        initAction(binding)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PlanListViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun initAction(binding: PlanListFragmentBinding) {
        binding.addPlanButton.setOnClickListener {
            binding.root.findNavController().navigate(R.id.action_mainFragment_to_planFragment)
        }
    }

}
