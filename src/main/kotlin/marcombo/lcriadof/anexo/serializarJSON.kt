package marcombo.lcriadof.anexo

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString
import kotlinx.serialization.decodeFromString

@Serializable
data class User(val id: Int, val name: String)

fun main() {
    val user = User(1, "Luis")
    val json = Json.encodeToString(user)
    println("Serialized JSON: $json")

    val deserialized = Json.decodeFromString<User>(json)
    println("Deserialized Object: $deserialized")
}
