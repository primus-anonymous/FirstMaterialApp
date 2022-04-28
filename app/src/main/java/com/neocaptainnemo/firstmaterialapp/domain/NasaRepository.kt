package com.neocaptainnemo.firstmaterialapp.domain

import com.neocaptainnemo.firstmaterialapp.api.PictureOfTheDayResponse

interface NasaRepository {

    suspend fun pictureOfTheDay(): PictureOfTheDayResponse
}