data class Photo(
    override val type: String = "PhotoAttachments",
    val id: Int,                     //Идентификатор фотографии.
    val albumId: Int,                //Идентификатор альбома, в котором находится фотография.
    val ownerId: Int,                //Идентификатор владельца фотографии.
    val userInt: Int,                //Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text: String,                //Текст описания фотографии.
    val date: Int,                   //Дата добавления в формате Unixtime.
    val width: Int,                  //Ширина оригинала фотографии в пикселах.
    val height: Int,                 //Высота оригинала фотографии в пикселах.

): Attachments