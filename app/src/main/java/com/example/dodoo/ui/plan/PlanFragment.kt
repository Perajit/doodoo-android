package com.example.dodoo.ui.plan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dodoo.R


class PlanFragment : Fragment() {

    companion object {
        fun newInstance() = PlanFragment()
    }

    private lateinit var viewModel: PlanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.plan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PlanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
