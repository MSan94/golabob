package com.ms.golabob.base

import android.os.Bundle
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.ms.golabob.R
import com.ms.golabob.databinding.ActivityBaseBinding
import kotlin.reflect.KClass

abstract class BaseActivity<T : ViewDataBinding, VM : BaseViewModel>(
    @LayoutRes private val resourceId : Int,
    private val viewModelClass : KClass<VM>,
    private val viewModelId : Int
) : AppCompatActivity() {
    lateinit var baseBinding : ActivityBaseBinding
    lateinit var viewDataBinding : T
    lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initInstance()
    }
    private fun initInstance() {
        baseBinding = DataBindingUtil.setContentView(this, R.layout.activity_base)
        viewModel = ViewModelProvider(this)[viewModelClass.java]
        viewDataBinding = DataBindingUtil.inflate(layoutInflater, resourceId, baseBinding.clContainer, true)
        viewDataBinding.setVariable(viewModelId, viewModel)
    }
}