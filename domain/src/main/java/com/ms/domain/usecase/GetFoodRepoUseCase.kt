package com.ms.domain.usecase

import com.ms.domain.repository.FoodRepository
import javax.inject.Inject

class GetFoodRepoUseCase @Inject constructor(
    private val foodRepository: FoodRepository
) {

    suspend fun execute() = foodRepository.getFoods()

}