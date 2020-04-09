package com.example.dodoo.ui.planInput

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dodoo.R


class PlanInputFragment : Fragment() {

    companion object {
        fun newInstance() = PlanInputFragment()
    }

    private lateinit var viewModel: PlanInputViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.plan_input_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PlanInputViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
