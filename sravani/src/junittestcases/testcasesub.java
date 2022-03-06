package junittestcases;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.Mul;
import junit.Sub;
import junit.framework.Assert;

public class testcasesub {

	@Test
	public void test() {
		Sub obj=new Sub();
		int res=obj.substraction(10,5);
		Assert.assertEquals(5, res);
		
	}

}
