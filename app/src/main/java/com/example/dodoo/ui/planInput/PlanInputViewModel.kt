package com.example.dodoo.ui.planInput

import com.example.dodoo.data.PlanRepository
import com.example.dodoo.injection.BaseViewModel
import javax.inject.Inject

class PlanInputViewModel : BaseViewModel() {

    @Inject
    lateinit var planRepository: PlanRepository

}
