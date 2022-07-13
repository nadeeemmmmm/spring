package com.example.demo;

import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringTestApplicationTests {

	@Autowired
	StudentRepo repo;
	
	@Test
	public void test() {
		System.out.println("Enter");
		Student s=new Student();
		s.setName("Peter");
		s.setEmail("Pet@gmail.com");
		assertNotNull(repo.save(s));
	}
}
