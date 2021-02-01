package com.alexta.apps.android.weather.application.view

import androidx.lifecycle.Lifecycle
import androidx.navigation.findNavController
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.alexta.apps.android.weather.R
import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ApplicationActivityShould {

    @get:Rule
    internal val rule = activityScenarioRule<ApplicationActivity>()

    @Test
    internal fun useApplicationNavGraph(): Unit = with(rule) {
        scenario.onActivity { activity ->
            val navController = activity.findNavController(R.id.applicationNavHostContainer)

            assertThat(navController.graph.id).isEqualTo(R.id.applicationNavGraph)
        }
    }

    @Test
    internal fun haveForecastScreenAsStartDestination(): Unit = with(rule) {
        scenario.onActivity { activity ->
            val navController = activity.findNavController(R.id.applicationNavHostContainer)

            assertThat(navController.graph.startDestination).isEqualTo(R.id.forecastFragment)
        }
    }

    @Test
    internal fun showForecastScreenWhenActivityIsCreated(): Unit = with(rule) {
        scenario.moveToState(Lifecycle.State.CREATED)
        scenario.onActivity { activity ->
            val navController = activity.findNavController(R.id.applicationNavHostContainer)

            assertThat(navController.currentDestination?.id).isEqualTo(R.id.forecastFragment)
        }
    }

}