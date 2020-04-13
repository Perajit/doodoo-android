package com.example.dodoo.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData

class PlanRepository {

    private var planList = listOf(
        Plan(title = "Title 1", time = 1584883854410),
        Plan(title = "Title 2"),
        Plan(title = "Title 3", time = 1584893854410)
    )

    fun getPlanList(): LiveData<List<Plan>> = liveData { emit(planList) }

    suspend fun addPlan(plan: Plan) {
        planList = planList.toMutableList().apply { add(plan) }
    }

}
