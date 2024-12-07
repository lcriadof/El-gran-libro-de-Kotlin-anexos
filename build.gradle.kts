plugins {
    kotlin("jvm") version "2.0.21" // Plugin para usar Kotlin con JVM
    kotlin("plugin.serialization") version "2.0.21" // Plugin de serialización compatible
     }

group = "marcombo.lcriadof.anexo"
version = "1.0"

repositories {
    mavenCentral() // para buscar dependencias
}

dependencies {
    testImplementation(kotlin("test")) // agrega las funcionalidades básicas de prueba para Kotlin, usando frameworks como JUnit.
    implementation("org.jetbrains.kotlin:kotlin-stdlib") // Librería estándar de Kotlin
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0") // Librería de serialización JSON
}

tasks.test {
    useJUnitPlatform()
}
/*
tasks.test: Configura cómo se ejecutan las pruebas del proyecto.
useJUnitPlatform(): Configura Gradle para usar JUnit 5 como framework de pruebas. Esto permite ejecutar pruebas con anotaciones y características de JUnit 5, que es la versión más reciente y potente de JUnit.
 */

kotlin {
    jvmToolchain(11)
}

