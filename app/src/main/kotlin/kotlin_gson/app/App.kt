/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kotlin_gson.app

import com.google.gson.Gson

data class User (
    val name: String = "",
    val age: Int = 0
)

fun main() {
    val user = User(
        name = "Alfian",
        age = 20
    )
    val userJson = Gson().toJson(user)

    println("user :")
    println(user)

    println("===============")

    println("userJson :")
    println(userJson)
    println("Is userJson string ? ${userJson is String}")

    println("===============")

    val convertedUserJson = Gson().fromJson<User>(userJson, User::class.java)
    println("convertedUserJson :")
    println(convertedUserJson)

    println("===============")

    val listUser = listOf(User("Andra", 20), User("Irvan", 19))
    println("users :")
    println(listUser)

    println("===============")
    val listUserJson = Gson().toJson(listUser)
    println("usersJson :")
    println(listUserJson)

    println("===============")
    val convertedListUserJson = Gson().fromJson(listUserJson, Array<User>::class.java).toList()
    println("convertedListUserJson :")
    println(convertedListUserJson)
}
