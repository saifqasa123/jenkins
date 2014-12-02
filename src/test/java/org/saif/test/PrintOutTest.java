/**
 * 
 */
package org.saif.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author saif
 *
 */
public class PrintOutTest {

	PrintOut printOut = new PrintOut();
	/**
	 * Test method for {@link org.saif.test.PrintOut#getName()}.
	 */
	@Test
	public void testGetName() {
		printOut.getName();
		
	}
	
	@Test
	public void testGetName2(){
		System.out.println(printOut.getName2(3));
	}
	@Test
	public void testGetName3(){
		System.out.println(printOut.getName2(0));
	}

}
