package com.example.persons

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/persons")
class PersonController {

    @GetMapping
    fun getAll() = arrayOf(
            Person("Herbie", "Husker", 34),
            Person("John", "Doe", 15),
            Person("Jane", "Doe", 21),
            Person("Billy", "Nerd", 30))
}
