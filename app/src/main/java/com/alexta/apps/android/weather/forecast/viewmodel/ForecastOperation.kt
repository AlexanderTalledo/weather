package com.alexta.apps.android.weather.forecast.viewmodel

import com.alexta.apps.android.weather.shared.framework.lifecycle.ViewModelOperation

sealed class ForecastOperation : ViewModelOperation {

    object OnWeatherForecastFetched : ForecastOperation()

}