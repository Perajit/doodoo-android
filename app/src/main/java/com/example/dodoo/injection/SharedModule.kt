package com.example.dodoo.injection

import com.example.dodoo.data.PlanRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object SharedModule {

    @Singleton
    @Provides
    fun providePlanRepository() = PlanRepository()

}
