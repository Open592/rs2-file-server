buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "2.0.21"))
    }
}

plugins {
    kotlin("jvm") version "2.0.21"
}

group = "world.gregs.rs2.file"
group = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.displee:rs-cache-library:7.1.8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
    implementation("io.ktor:ktor-server-core:3.0.1")
    implementation("io.ktor:ktor-network:3.0.1")

    implementation("ch.qos.logback:logback-classic:1.5.12")
    implementation("com.michael-bull.kotlin-inline-logger:kotlin-inline-logger-jvm:1.0.5")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.3")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.11.3")
    testImplementation("io.mockk:mockk:1.13.13")
}
