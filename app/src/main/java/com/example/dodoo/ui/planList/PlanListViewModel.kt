package com.example.dodoo.ui.planList

import com.example.dodoo.data.PlanRepository
import com.example.dodoo.injection.BaseViewModel
import javax.inject.Inject

class PlanListViewModel : BaseViewModel() {

    @Inject
    lateinit var planRepository: PlanRepository

    val planList by lazy { planRepository.getPlanList() }

}
