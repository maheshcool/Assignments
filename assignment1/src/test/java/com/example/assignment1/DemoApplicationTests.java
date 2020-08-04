package com.example.assignment1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class DemoApplicationTests {

	@Test
	void contextLoads() {
		Book b1 = new Book();
		assert(b1.add(3,4), 7);
	}

}
