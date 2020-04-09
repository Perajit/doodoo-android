package com.example.dodoo.ui.planInput

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.dodoo.R
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PlanInputFragmentTest {

    lateinit var scenario: FragmentScenario<PlanInputFragment>

    @Before
    fun setUp() {
        scenario = launchFragmentInContainer()
    }

    @Test
    fun `display content`() {
        onView(withId(R.id.planMessage)).check(matches(withText("PlanInputFragment")))
    }

}
