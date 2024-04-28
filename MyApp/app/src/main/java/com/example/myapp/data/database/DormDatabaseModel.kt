package com.example.myapp.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DormDatabaseModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val dormName: String,
    val imageUrl: String,
    val location: String,
    val minPrice: Int,
    val maxPrice: Int,
    val tel: String,
    val bail: Int, //month
    val upfront: Int, //month
    val electricity: Int, // bath/unit
    val otherBill: String,
    val internet: Int, // bath
    val details: String,
    val isFavorite: Boolean,
) {
    companion object {
        val DEFAULT_DORM = listOf(
            DormDatabaseModel(dormName = "DormA", imageUrl = "https://static.vecteezy.com/system/resources/thumbnails/025/181/412/small/picture-a-captivating-scene-of-a-tranquil-lake-at-sunset-ai-generative-photo.jpg", location = "F", minPrice = 8000, maxPrice = 17000, tel = "088 931 3900", bail = 1, upfront = 2, electricity = 9, otherBill = "otherBill1", internet = 599, details = "Details1", isFavorite = false),
            DormDatabaseModel(dormName = "DormB", imageUrl = "https://static.vecteezy.com/system/resources/thumbnails/034/263/090/small_2x/the-sun-rises-over-a-lake-and-purple-flowers-ai-generated-free-photo.jpg", location = "E", minPrice = 9000, maxPrice = 17000, tel = "080 874 8136", bail = 2, upfront = 3, electricity = 10, otherBill = "otherBill2", internet = 699, details = "Details1", isFavorite = true),
            DormDatabaseModel(dormName = "DormC", imageUrl = "https://www.shutterstock.com/image-photo/beauty-nature-combination-river-trees-260nw-1993469978.jpg", location = "D", minPrice = 10000, maxPrice = 17000, tel = "083 042 4573", bail = 3, upfront = 4, electricity = 11, otherBill = "otherBill3", internet = 799, details = "Details1", isFavorite = false),
            DormDatabaseModel(dormName = "DormD", imageUrl = "https://rukminim2.flixcart.com/image/850/1000/xif0q/poster/2/h/0/medium-beautifull-nature-wall-picture-photographic-paper-14x20-original-imag6jtayz9vphgx.jpeg?q=90&crop=false", location = "C", minPrice = 11000, maxPrice = 17000, tel = "068 153 6596", bail = 4, upfront = 5, electricity = 12, otherBill = "otherBill4", internet = 899, details = "Details1", isFavorite = true),
            DormDatabaseModel(dormName = "DormE", imageUrl = "https://media.wired.com/photos/598e35fb99d76447c4eb1f28/master/pass/phonepicutres-TA.jpg", location = "B", minPrice = 12000, maxPrice = 17000, tel = "060 293 8171", bail = 5, upfront = 6, electricity = 13, otherBill = "otherBill5", internet = 999, details = "Details1", isFavorite = false),
            DormDatabaseModel(dormName = "DormF", imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREDDDHXGo1eRZJ5C-DQ563Iw1XyGQEuUh7DTu6_VBvKbeJODUg2Yw43swAU9y7Db6OZjY&usqp=CAU", location = "A", minPrice = 13000, maxPrice = 17000, tel = "090 438 7546", bail = 6, upfront = 7, electricity = 14, otherBill = "otherBill16", internet = 1099, details = "Details1", isFavorite = true),
        )
    }
}