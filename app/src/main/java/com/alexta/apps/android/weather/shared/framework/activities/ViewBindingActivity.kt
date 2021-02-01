package com.alexta.apps.android.weather.shared.framework.activities

import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class ViewBindingActivity<VB : ViewBinding> : AppCompatActivity() {

    internal abstract var viewBinding: VB?

    override fun onDestroy() {
        viewBinding = null
        super.onDestroy()
    }

}