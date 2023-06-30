import Reactions.Comment
import Reactions.Likes
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class PostTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        // здесь код с вызовом функции, которая должна выкинуть PostNotFoundException
        WallService.add(post = Post())
        WallService.add(post = Post())
        WallService.add(post = Post())
        WallService.add(post = Post())

        WallService.createComment(postId = 5, comment = Comment())
    }

    @Test(expected = PostNotFoundException::class)
    fun commentAdded() {
        val postId = 2
        WallService.add(post = Post())
        val result = WallService.createComment(postId = postId, comment = Comment())

        assertEquals(postId, result.id)
    }

    @Test
    fun addTest() {
        val post = Post(id = 1, like = Likes(12), text = "Kotlin")
        WallService.add(post)
        assertEquals(1, post.id)
    }

    @Test
    fun updateExistingTrue() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(Post(id = 1))
        service.add(Post(id = 2))
        service.add(Post(id = 3))
        // создаём информацию об обновлении
        val update = Post(id = 1)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateExistingFalse() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(Post(id = 1))
        service.add(Post(id = 2))
        service.add(Post(id = 3))
        // создаём информацию об обновлении
        val update = Post(id = 4)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}