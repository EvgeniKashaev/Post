object WallService {


    private var posts = emptyArray<Post>()
    private var idNew = 1


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
        // также здесь нужно сбросить счетчик для id постов, если он у вас используется
    }
}