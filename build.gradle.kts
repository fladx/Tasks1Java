plugins {
    id("java")
    id("application")
}

group = "pool"
version = "1.0.0"

repositories {
    mavenCentral()
}

application {
    mainClass.set("pool.Main")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc> {
    options.encoding = "UTF-8"
}

tasks.named<JavaExec>("run") {
    jvmArgs = listOf("-Dfile.encoding=UTF-8", "-Dconsole.encoding=UTF-8")
}