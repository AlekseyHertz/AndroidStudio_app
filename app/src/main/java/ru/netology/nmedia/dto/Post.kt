package ru.netology.nmedia.dto

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    var likes: Int = 10,
    var likedByMe: Boolean = false,
    var sharedCount: Int = 0,
    var shareByMe: Boolean = false
)


fun shareScore(sharedCount: Int): String {
    return when (sharedCount) {
        in 1000..1099 -> "1k"
        in 1100..1199 -> "1.1k"
        in 1200..1299 -> "1.2k"
        in 1300..1399 -> "1.3k"
        in 1400..1499 -> "1.4k"
        in 1500..1599 -> "1.5k"
        in 1600..1699 -> "1.6k"
        in 1700..1799 -> "1.7k"
        in 1800..1899 -> "1.8k"
        in 1900..1999 -> "1.9k"
        else -> sharedCount.toString()
    }
}

fun likesScore(likes: Int): String {
    return when (likes) {
        in 1000..1099 -> "1k"
        in 1100..1199 -> "1.1k"
        in 1200..1299 -> "1.2k"
        in 1300..1399 -> "1.3k"
        in 1400..1499 -> "1.4k"
        in 1500..1599 -> "1.5k"
        in 1600..1699 -> "1.6k"
        in 1700..1799 -> "1.7k"
        in 1800..1899 -> "1.8k"
        in 1900..1999 -> "1.9k"
        else -> likes.toString()
    }
}