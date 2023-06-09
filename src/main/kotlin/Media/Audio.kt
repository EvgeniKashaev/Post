package Media
import Navigation.Date

data class Audio(
    val id: Int,                        //Идентификатор аудиозаписи.
    val ownerId: Int,                   //Идентификатор владельца аудиозаписи.
    val artist: String,                 //Исполнитель.
    val title: String,                  //Название композиции.
    val duration: Int,                  //Длительность аудиозаписи в секундах.
    val url: String,                    //Ссылка на mp3.
    val lyricsId: Int,                  //Идентификатор текста аудиозаписи (если доступно).
    val albumId: Int,                   //Идентификатор альбома, в котором находится аудиозапись (если присвоен).
    val genreId: Int,                   //Идентификатор жанра из списка аудио жанров.
    val date: String? = Date.date(),    //Дата добавления.
    val noSearch: Int,                  //[1]    1, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    val isHq: Int,                      //[1]1, если аудио в высоком качестве.
)