plugins {
    id 'java'
    id 'application'
    id 'checkstyle'
}

group = 'com.example'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = 'com.example.Main'
}

test {
    useJUnitPlatform()
}

tasks.named('test') {
    useJUnitPlatform()
}