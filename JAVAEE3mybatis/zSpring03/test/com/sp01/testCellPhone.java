package com.sp01;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zsp01.myCellPhone;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"/ApplicationContext.xml" })
public class testCellPhone {

	@Autowired
	myCellPhone cp;
	@Test
	public void testRun()
	{
		String re=cp.run();
		assertEquals("PhoneXX",re);
	}
}

