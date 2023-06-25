import java.text.SimpleDateFormat
import java.util.Date

val dateFormat = SimpleDateFormat("EEE, d MMM yyyy,  HH:mm:ss z")
var deteNew = dateFormat.format(Date())

data class Post(
    var like: Likes = Likes(1),
    var id: Int,
    var text: String = "Hello",
    var date: String = deteNew,
    var copyright: String = "Google",
    var createdBy: Int = 1,
    var isPinned: Int? = 1,
    var isFavorite: Boolean = true,
    var markedAsAds: Int = 0,
    val attachments: Array<Attachments> = arrayOf()
)