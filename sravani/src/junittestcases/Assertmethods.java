package junittestcases;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assertmethods {

	@Test
	public void test() {
		String s1=null;
		String s2="sravani";
		assertNotNull(s2);
	}
	@Test
	public void test1() {
		String s1=null;
		String s2="sravanthi";
		assertNull(s1);
		
	}
	@Test
	public void test2() {
		int a=2;
		int b=2;
		assertSame(a,b);
		
		int c=4;
		int d=6;
		assertNotSame(c,d);
	
		String s1="welcome";
		String s2="welcome";
		assertSame(s1,s2);
	}
	@Test
	public void test3() {
		int a[]= {11,22,33,44,55};
		int b[]= {11,22,33,44,55};
		assertArrayEquals(a,b);
	}
	@Test
	public void tset4() {
		int a=8;
		int b=2;
		int sum=a+b;
		assertTrue(sum==10);
		assertFalse(sum==20);
		assertEquals(10,sum);
		assertNotSame(a,b);
	}
	
}
