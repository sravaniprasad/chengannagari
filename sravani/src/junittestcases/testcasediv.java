package junittestcases;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.Div;
import junit.Mul;
import junit.framework.Assert;

public class testcasediv {

	@Test
	public void test() {
		Div obj=new Div();
		int res=obj.division(10,5);
		Assert.assertEquals(2, res);
		
	}

}
