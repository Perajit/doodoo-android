package com.example.dodoo.ui.planInput

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PlanInputViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PlanInputViewModel() as T
    }

}
