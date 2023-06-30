package Reactions

import Navigation.Date

data class Comment(
    val id: Int = 0,                                         //Идентификатор комментария.
    val fromId: Int = 0,                                     //Идентификатор автора комментария.
    val date: String? = Date.date(),                         //Дата создания комментария в формате Unixtime.
    val replyToUser: Int = 0,                                //Идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо).
    val replyToComment: Int = 0,                             //Идентификатор комментария, в ответ на который оставлен текущий (если применимо).
    val count: Int = 0,                                      //количество комментариев в ветке.

    val text: String = "",                                    //Текст комментария.
    val placeholder: String = "",                             //заглушка для пользователей, которые не оформили подписку VK Donut.

    val isDon: Boolean = true,                                //является ли комментатор подписчиком VK Donut.
    val canPost: Boolean = true,                              //может ли текущий пользователь оставлять комментарии в этой ветке.
    val groupsCanPost: Boolean = true,                        // могут ли сообщества оставлять комментарии в ветке.
)
