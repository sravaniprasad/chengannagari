package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class Junitdemo {

	@Test
	public void test() {
	System.out.println("test method");

	}
	
	@After
	public void After() {
		System.out.println("this is after class");
	}
	
	@Before
	public void before() {
		System.out.println("this is before class");
	}

}
