package com.baeldung


import org.junit.Assert.assertEquals
import org.junit.Test

class ValidatorTest {
	@Test
	fun test() {
		val v = Validator()
		val item = Item(1.0f, "aaa")
		assertEquals(v.isValid(item), true)
	}
}