package io.icednut.spring.exercise;

import io.icednut.spring.exercise.model.Tv;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void contextLoads() {
		Tv samsungTv = (Tv) applicationContext.getBean("samsungTv");
		samsungTv.powerOn();
	}

}
