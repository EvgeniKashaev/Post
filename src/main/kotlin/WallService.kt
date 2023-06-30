import Reactions.Comment


object WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var idNew = 1

    fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts) {
            if (post.id == postId) {
                val commentNew = comment.copy(id = postId)
                comments += commentNew

                return comments.last()
            }
        }
        throw PostNotFoundException("No post $postId")
    }

    fun add(post: Post): Post {
        val postNew = post.copy(id = idNew++)
        posts += postNew
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postFromArray) in posts.withIndex()) {
            if (post.id == index) {
                posts[index] = postFromArray.copy(
                    text = post.text,
                    like = post.like,
                )
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        idNew = 0
    }
}