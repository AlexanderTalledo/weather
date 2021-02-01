package com.alexta.apps.android.weather.shared.framework.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class ViewBindingActivity<VB : ViewBinding> : AppCompatActivity() {

    internal abstract var viewBinding: VB?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding?.root)
    }

}