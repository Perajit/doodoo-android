package com.example.dodoo.ui.planInput

import com.example.dodoo.data.Plan
import com.example.dodoo.data.PlanRepository
import com.example.dodoo.injection.BaseViewModel
import javax.inject.Inject

class PlanInputViewModel : BaseViewModel() {

    @Inject
    lateinit var planRepository: PlanRepository

    suspend fun addPlan(plan: Plan) {
        planRepository.addPlan(plan)
    }

}
