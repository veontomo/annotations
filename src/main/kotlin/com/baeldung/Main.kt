package com.baeldung

fun main(args: Array<String>) {
	val item = Item(amount = 1.0f, name = "Bob")
	val validator = Validator()
	println(validator.isValid(item))
}
