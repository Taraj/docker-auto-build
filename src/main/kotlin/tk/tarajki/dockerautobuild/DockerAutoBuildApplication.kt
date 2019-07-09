package tk.tarajki.dockerautobuild

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerAutoBuildApplication

fun main(args: Array<String>) {
    runApplication<DockerAutoBuildApplication>(*args)
}
