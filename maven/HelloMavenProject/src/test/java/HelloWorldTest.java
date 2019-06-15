package com.yy.www.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest{

//in JUnit4,all the tested method should be annotated by @Test
	@Test
	public void testSayHello(){
		HelloWorld hw = new HelloWorld();
		String result = hw.sayHello();
		assertEquals("Hello Maven",result);
	}
}
