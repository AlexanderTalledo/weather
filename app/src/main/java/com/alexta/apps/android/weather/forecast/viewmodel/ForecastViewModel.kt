package com.alexta.apps.android.weather.forecast.viewmodel

import com.alexta.apps.android.weather.shared.framework.lifecycle.OperationViewModel
import javax.inject.Inject

class ForecastViewModel @Inject constructor() : OperationViewModel<ForecastOperation>() {

    internal fun fetchWeatherForecast() {
        update(ForecastOperation.OnWeatherForecastFetched)
    }

}