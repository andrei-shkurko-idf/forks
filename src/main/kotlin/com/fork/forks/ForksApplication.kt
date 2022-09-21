package com.fork.forks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ForksApplication

fun main(args: Array<String>) {
  runApplication<ForksApplication>(*args)
}
