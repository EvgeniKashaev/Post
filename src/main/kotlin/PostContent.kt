import Media.*

data class GraffitiAttachments(override val type: String, val graffiti: Graffiti): Attachments
data class AudioAttachment(override val type: String, val audio: Audio) : Attachments
data class AppAttachments(override val type: String, val app: App): Attachments
data class VideoAttachments(override val type: String, val video: Video): Attachments
data class PhotoAttachments(override val type: String, val photo: Photo): Attachments