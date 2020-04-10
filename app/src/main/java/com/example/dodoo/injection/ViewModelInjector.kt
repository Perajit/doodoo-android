package com.example.dodoo.injection

import com.example.dodoo.ui.planInput.PlanInputViewModel
import com.example.dodoo.ui.planList.PlanListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PlanModule::class])
interface ViewModelInjector {

    fun inject(planListViewModel: PlanListViewModel)
    fun inject(planInputViewModel: PlanInputViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector
        fun planModule(planModule: PlanModule): Builder
    }

}
