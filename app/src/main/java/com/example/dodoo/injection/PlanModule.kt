package com.example.dodoo.injection

import com.example.dodoo.data.PlanRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object PlanModule {

    @Singleton
    @Provides
    fun providePlanRepository() = PlanRepository()

}
