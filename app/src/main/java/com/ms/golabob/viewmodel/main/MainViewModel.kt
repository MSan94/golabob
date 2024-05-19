package com.ms.golabob.viewmodel.main

import androidx.lifecycle.viewModelScope
import com.ms.domain.usecase.GetFoodRepoUseCase
import com.ms.golabob.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getFoodRepoUseCase: GetFoodRepoUseCase
) : BaseViewModel() {

    fun getFoods() = viewModelScope.launch {
        val response = getFoodRepoUseCase.execute()
    }

}