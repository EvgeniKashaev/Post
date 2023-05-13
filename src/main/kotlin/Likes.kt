data class Likes(
    var count: Int = 1,
    val userLikes: Boolean = false,
    val canLike: Boolean = true,
    val canPublish: Boolean = true,
)