package com.compound.calculator.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class serviceTest {
	
	@Test
	void testCalculate() {
		service s = new service((float)1000,(float)3,(float)0.05); 
		float a=(float)s.calculate();
		System.out.println(a);
		assertEquals(a, 1157.6248779296875);
			
	}
	@Test
	void testGetPrincipal() {
		service s = new service();
		s.setPrincipal(1000);
		float a=(float)s.getPrincipal();		
		assertEquals(a, 1000);
		
		s.setRate((float)5);
		float b=(float)s.getRate();
		assertEquals(b,5);
		
		s.setTime(3);
		float c=(float)s.getTime();
		assertEquals(c, 3);
		

		float f = s.calculate();
		assertEquals(f,216000.0);
		
			
	}
}
