class App(   //Контент приложения
    override val type: String = "AppAttachments",
    val id: Int,	        //Идентификатор приложения.
    val name: String,	    //Название приложения.
    val photo130: String,   //URL изображения для предпросмотра.
    val photo604: String	//URL полноразмерного изображения.
): Attachments