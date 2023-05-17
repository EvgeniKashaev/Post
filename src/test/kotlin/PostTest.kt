import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class PostTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addTest() {
        val post = Post(id = 12, like = Likes(12), text = "Kotlin")
        WallService.add(post)
        assert(true)
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
