package com.ms.golabob.view.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ms.golabob.R
import com.ms.golabob.base.BaseActivity
import com.ms.golabob.databinding.ActivityMainBinding
import com.ms.golabob.viewmodel.main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import com.ms.golabob.BR

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main,
    MainViewModel::class,
    BR.vmMain
) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getFoods()
    }
}