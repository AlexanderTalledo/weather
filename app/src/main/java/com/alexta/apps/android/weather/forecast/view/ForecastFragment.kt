package com.alexta.apps.android.weather.forecast.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alexta.apps.android.weather.databinding.FragmentForecastBinding
import com.alexta.apps.android.weather.forecast.viewmodel.ForecastOperation
import com.alexta.apps.android.weather.forecast.viewmodel.ForecastViewModel
import com.alexta.apps.android.weather.shared.framework.fragments.ViewBindingFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ForecastFragment : ViewBindingFragment<FragmentForecastBinding>() {

    @Inject
    internal lateinit var viewModel: ForecastViewModel

    override var viewBinding: FragmentForecastBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val attachToParent = false
        viewBinding = FragmentForecastBinding.inflate(inflater, container, attachToParent)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchWeatherForecast()
    }

    override fun initViews() {}

    override fun initObservers() {
        viewModel.operation.observe(this, { operation ->
            when (operation) {
                ForecastOperation.OnWeatherForecastFetched -> updateForecastView()
            }
        })
    }

    private fun updateForecastView() {
        Log.e("AAAAAAAAAAAAAA", "updateForecastView")
    }

}