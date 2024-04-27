package com.example.myapp.model
const val NEW_PHONE_ID = -1L
data class DormModel(
    val id: Long = NEW_PHONE_ID,
    val dormName: String = "",
    val imageUrl: String = "",
    val location: String = "",
    val price: String = "",
    val tel: String =  "",
    val bail: Int = 0, //month
    val upfront: Int = 0, //month
    val electricity: Int = 0, // bath/unit
    val otherBill: String = "",
    val internet: Int = 0, // bath
    val details: String = "",
    val isFavorite: Boolean = false,
)