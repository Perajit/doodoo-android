package com.example.dodoo.ui

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.Window
import com.example.dodoo.R
import kotlinx.android.synthetic.main.date_time_dialog.*
import java.text.SimpleDateFormat
import java.util.*

class DateTimeDialog(
    context: Context?
) : Dialog(context) {

    private val calendar = Calendar.getInstance()
    private val dateFormatter = SimpleDateFormat("MMM d, yyyy")
    private val timeFormatter = SimpleDateFormat("HH:mm")

    private val dateListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, month)
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
        date_input.setText(dateFormatter.format(Date()))
    }

    private val timeListener = TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
        calendar.set(Calendar.MINUTE, minute)
        time_input.setText(timeFormatter.format(Date()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.date_time_dialog)

        initAction()
    }

    fun initAction() {
        date_input.setOnClickListener { showDatePicker() }
        time_input.setOnClickListener { showTimePicker() }
        dialog_ok_button.setOnClickListener { setDateTime() }
        dialog_cancel_button.setOnClickListener { dismiss() }
    }

    fun showDatePicker() {
        DatePickerDialog(
            this.context,
            dateListener,
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DATE)
        ).show()
    }

    fun showTimePicker() {
        TimePickerDialog(
            this.context,
            timeListener,
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            true
        ).show()
    }

    fun setDateTime() {
        println("------- set date time")
    }

}

interface DateTimeSetListener {
    fun onDateTimeSet(calendar: Calendar)
}
