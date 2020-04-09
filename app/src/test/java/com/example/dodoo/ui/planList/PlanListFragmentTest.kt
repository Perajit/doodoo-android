package com.example.dodoo.ui.planList

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.dodoo.R
import org.hamcrest.Matchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PlanListFragmentTest {

    lateinit var scenario: FragmentScenario<PlanListFragment>

    @Before
    fun setUp() {
        scenario = launchFragmentInContainer()
    }

    @Test
    fun `display content`() {
        onView(withId(R.id.message)).check(matches(withText("PlanListFragment")))
    }

    @Test
    fun `navigate to Plan fragment when click to add plan`() {
        val navController = TestNavHostController(ApplicationProvider.getApplicationContext())
        navController.setGraph(R.navigation.nav_main)

        scenario.onFragment { fragment ->
            Navigation.setViewNavController(fragment.requireView(), navController)
        }

        onView(withId(R.id.addPlanButton)).perform(click())

        assertThat(navController.currentDestination?.id, equalTo(R.id.planFragment))
    }
}
