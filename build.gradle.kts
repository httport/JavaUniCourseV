import java.io.File
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
    application
}

group = "com.github.httport"
version = "0.0.1"

application {
    mainClass.set("com.github.httport.AppKt")
    applicationDefaultJvmArgs = "-Dfile.encoding=UTF-8".split(" ")
}

java {
    targetCompatibility = JavaVersion.VERSION_16
    sourceCompatibility = JavaVersion.VERSION_16
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "16"
    }
}

tasks.withType<JavaExec> {
    // Needed to be able to use readLine
    standardInput = System.`in`

    val f = File("build/run/")
    if (!f.exists()) {
        f.mkdir()
    }

    workingDir = f
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = application.mainClass.get()
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(kotlin("bom")))
    implementation(kotlin("stdlib"))

    implementation("com.google.guava:guava:31.0.1-jre")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}