import org.gradle.kotlin.dsl.registering

plugins {
    application
    java
    id("org.danilopianini.gradle-java-qa") version "1.65.1"
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("it.unibo.exceptions.UseArithmeticService")
}
