package com.example.dodoo.injection

import androidx.lifecycle.ViewModel
import com.example.dodoo.ui.planInput.PlanInputViewModel
import com.example.dodoo.ui.planList.PlanListViewModel

abstract class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .planModule(PlanModule)
        .build()

    init {
        when (this) {
            is PlanListViewModel -> injector.inject(this)
            is PlanInputViewModel -> injector.inject(this)
        }
    }

}