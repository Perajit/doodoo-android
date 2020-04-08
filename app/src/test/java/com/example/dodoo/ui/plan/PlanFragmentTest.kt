package com.example.dodoo.ui.plan

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.dodoo.R
import com.example.dodoo.ui.main.MainFragment
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PlanFragmentTest {

    lateinit var scenario: FragmentScenario<PlanFragment>

    @Before
    fun setUp() {
        scenario = launchFragmentInContainer()
    }

    @Test
    fun `display content`() {
        onView(withId(R.id.planMessage)).check(matches(withText("PlanFragment")))
    }

}