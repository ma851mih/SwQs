package Aufgabe3.Aufgabenblatt3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

	Calculator calc;						//Deklaration der Objektvariable kal der Klasse Calculator
	
	@Before public void setup() {
		calc = new Calculator();			//Instanziieren der Objektvariable kal
	}
	
	@Test
	public void add1() {
		int erg = 10;
		int erg2 = calc.addition(5, 5);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void add2() {
		int erg = 0;
		int erg2 = calc.addition(0, 0);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void add3() {
		int erg = 10;
		int erg2 = calc.addition(10, 0);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void add4() {
		int erg = -10;
		int erg2 = calc.addition(10, -20);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void add5() {
		int erg = -30;
		int erg2 = calc.addition(-10, -20);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void sub1() {
		int erg = 5;
		int erg2 = calc.subtraction(10, 5);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void sub2() {
		int erg = 10;
		int erg2 = calc.subtraction(10, 0);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void sub3() {
		int erg = -10;
		int erg2 = calc.subtraction(0, 10);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void sub4() {
		int erg = -20;
		int erg2 = calc.subtraction(-10, 10);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void sub5() {
		int erg = 0;
		int erg2 = calc.subtraction(-10, -10);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void sub6() {
		int erg = 20;
		int erg2 = calc.subtraction(10, -10);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void multi1() {
		int erg = 25;
		int erg2 = calc.multiplication(5, 5);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void multi2() {
		int erg = 0;
		int erg2 = calc.multiplication(5, 0);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void multi3() {
		int erg = 0;
		int erg2 = calc.multiplication(0, 0);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void multi4() {
		int erg = -20;
		int erg2 = calc.multiplication(10, -2);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void multi5() {
		int erg = 20;
		int erg2 = calc.multiplication(-10, -2);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void multi6() {
		int erg = -20;
		int erg2 = calc.multiplication(10, -2);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void div1() {
		int erg = 1;
		int erg2 = calc.division(5, 5);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void div2() {
		int erg = 0;
		int erg2 = calc.division(0, 5);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void div3() {
		int erg = -2;
		int erg2 = calc.division(10, -5);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void div4() {
		int erg = -5;
		int erg2 = calc.division(-10, 2);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void div5() {
		int erg = 5;
		int erg2 = calc.division(-10, -2);
		assertEquals(erg, erg2);
	}
	
	@Test
	public void div6() {
		int erg = 3;
		int erg2 = calc.division(10, 3);
		assertEquals(erg, erg2);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void div7() {
		calc.division(10, 0);
	}
	

	@After public void teardown() {
		calc = null;						//Bereinigen der Objektvariable
	}

}
