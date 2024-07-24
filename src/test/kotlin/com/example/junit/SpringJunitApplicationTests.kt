package com.example.junit

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SpringJunitApplicationTests {

	@Test
	fun sixPlusSixEqual12() {
		val calculator = Calculator()
		calculator.sumTwoNum(6 , 6)
		assertEquals(12, calculator.sumTwoNum(6, 6))
	}


}
