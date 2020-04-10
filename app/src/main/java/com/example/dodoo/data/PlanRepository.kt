package com.example.dodoo.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData

class PlanRepository {

    private var planList = listOf(
        Plan(title = "Title 1", detail = "Detail 1", time = 1584883854410),
        Plan(title = "Title 2"),
        Plan(title = "Title 3", detail = "Detail 3")
    )

    fun getPlanList(): LiveData<List<Plan>> = liveData { emit(planList) }

}
