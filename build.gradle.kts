// criando dependencias com o gradle, para conseguir criar via linha de comando usamos o gradle init e preenchemos todas as informacoes
// com a ide do intellij so precisamos escolher o pacote de dependencia e criar o projeto, logo apos iniciar a ide o gradle fara downloads
plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

// colocando dependencia do spring no gradle, visitar site de repositorios centrais do maven
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
}

tasks.test {
    useJUnitPlatform()
}