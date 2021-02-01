package com.alexta.apps.android.weather.forecast.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alexta.apps.android.weather.databinding.FragmentForecastBinding
import com.alexta.apps.android.weather.shared.framework.fragments.ViewBindingFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ForecastFragment : ViewBindingFragment<FragmentForecastBinding>() {

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

}