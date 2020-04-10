package com.example.dodoo.ui.planList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PlanListViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PlanListViewModel() as T
    }

}
