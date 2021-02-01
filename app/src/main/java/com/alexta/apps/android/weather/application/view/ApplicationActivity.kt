package com.alexta.apps.android.weather.application.view

import android.os.Bundle
import com.alexta.apps.android.weather.databinding.ActivityApplicationBinding
import com.alexta.apps.android.weather.shared.framework.activities.ViewBindingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ApplicationActivity : ViewBindingActivity<ActivityApplicationBinding>() {

    override var viewBinding: ActivityApplicationBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityApplicationBinding.inflate(layoutInflater)
        setContentView(viewBinding?.root)
    }

}