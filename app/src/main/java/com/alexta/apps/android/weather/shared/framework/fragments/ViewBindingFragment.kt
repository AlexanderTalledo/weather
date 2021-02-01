package com.alexta.apps.android.weather.shared.framework.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class ViewBindingFragment<VB : ViewBinding> : Fragment() {

    internal abstract var viewBinding: VB?

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = viewBinding?.root

    override fun onDestroyView() {
        viewBinding = null
        super.onDestroyView()
    }

}