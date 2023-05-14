import org.junit.Test

class PostTest {
    @Test
    fun updatePostTrue() {
        val result = WallService.add(Post(id = 12))
        val post = Post(id = 1, like = Likes(-123), text = "Love")
        WallService.add(post)
        val post1 = Post(id = 1, like = Likes(0), text = "Hello")
        val test = WallService.update(post1)
        assert(test)
    }

    @Test
    fun updatePostTrue1() {
        val post2 = Post(id = 132)
        val test = WallService.update(post2)

        assert(!test)
    }
}