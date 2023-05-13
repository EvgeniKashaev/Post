object WallService {


    private var posts = emptyArray<Post>()
    private var idNew = 1


    fun likeNull(likes: Likes): Int {
        if (0 <= likes.count) {
            return likes.count
        }
        likes.count = 0
        return likes.count
    }

    fun add(post: Post): Post {
        val postNew = post.copy(id = idNew++)
        posts += postNew
        likeNull(post.like)
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
}