package Navigation

import java.text.SimpleDateFormat
import java.util.Date

data class Date(val date: Date) {
    companion object {
        fun date(): String? {
            val dateFormat = SimpleDateFormat("EEE, d MMM yyyy,  HH:mm:ss z")
            return dateFormat.format(Date())
        }
    }
} // очень хотелось автоматизировать этот пункт.