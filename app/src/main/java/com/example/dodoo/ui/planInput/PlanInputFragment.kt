package com.example.dodoo.ui.planInput

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.dodoo.R
import com.example.dodoo.databinding.PlanInputFragmentBinding
import com.example.dodoo.ui.DateTimeDialog
import com.example.dodoo.ui.DateTimeSetListener
import java.util.*

class PlanInputFragment : Fragment() {

    private val viewModel: PlanInputViewModel by viewModels { PlanInputViewModelFactory() }
    private lateinit var binding: PlanInputFragmentBinding
    private val calendar = Calendar.getInstance()

    private val dateListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, month)
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
    }

    private val timeListener = TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
        calendar.set(Calendar.MINUTE, minute)
    }

    private val dateTimeListener = object : DateTimeSetListener {
        override fun onDateTimeSet(calendar: Calendar) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            println("---- date time set")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.plan_input_fragment, container, false)

        initAction()

        return binding.root
    }

    fun initAction() {
        binding.planDateInput.setOnClickListener {
            DatePickerDialog(
                this.context,
                dateListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE)
            ).show()
        }
        binding.planTimeInput.setOnClickListener {
            TimePickerDialog(
                this.context,
                timeListener,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                true
            ).show()
        }
        binding.showDialogButton.setOnClickListener {
            DateTimeDialog(this.context).show()
        }
    }

}
