package com.github.erikpedro.heroisapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HeroisApiApplication

fun main(args: Array<String>) {
	runApplication<HeroisApiApplication>(*args)
}
