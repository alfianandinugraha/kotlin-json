/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("kotlin_gson.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("kotlin_gson.app.AppKt")
}
