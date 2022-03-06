package junittestcases;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.Mul;
import junit.framework.Assert;

public class testcasemul {

	@Test
		public void Test() {
			Mul obj=new Mul();
			int res=obj.multiplication(5,10);
			Assert.assertEquals(50, res);
			
		
		}
	}