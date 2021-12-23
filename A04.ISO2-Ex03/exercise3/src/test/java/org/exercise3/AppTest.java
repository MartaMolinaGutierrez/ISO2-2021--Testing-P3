package org.exercise3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.exercise3.*;

public class AppTest 
{	
	
	/**
	 * EACH USE COVERAGE
	 * @throws OutOfRangeException 
	 */
	
	@Test
	public void eachUsefunctionalCompleteness() throws OutOfRangeException {
		//assertEquals(Certificate.functionalCompleteness(-1), error); //TC1
		assertEquals(Certificate.functionalCompleteness(0), 0); //TC2
		assertEquals(Certificate.functionalCompleteness(1), 0); //TC3
		assertEquals(Certificate.functionalCompleteness(9), 0); //TC4
		assertEquals(Certificate.functionalCompleteness(10), 1); //TC5
		assertEquals(Certificate.functionalCompleteness(11), 1); //TC6
		assertEquals(Certificate.functionalCompleteness(34), 1); //TC7
		assertEquals(Certificate.functionalCompleteness(35), 2); //TC8
		assertEquals(Certificate.functionalCompleteness(36), 2); //TC9
		assertEquals(Certificate.functionalCompleteness(49), 2); //TC10
		assertEquals(Certificate.functionalCompleteness(50), 2); //TC11
		assertEquals(Certificate.functionalCompleteness(51), 2); //TC12
		assertEquals(Certificate.functionalCompleteness(69), 2); //TC13
		assertEquals(Certificate.functionalCompleteness(70), 3); //TC14
		assertEquals(Certificate.functionalCompleteness(71), 3); //TC15
		assertEquals(Certificate.functionalCompleteness(89), 3); //TC16
		assertEquals(Certificate.functionalCompleteness(90), 4); //TC17
		assertEquals(Certificate.functionalCompleteness(91), 4); //TC18
		assertEquals(Certificate.functionalCompleteness(99), 4); //TC19
		assertEquals(Certificate.functionalCompleteness(100), 4); //TC20
		//assertEquals(Certificate.functionalCompleteness(101), error); //TC21
	}
	
	@Test
	public void eachUsefunctionalCorrectness() throws OutOfRangeException {
		//assertEquals(Certificate.functionalCompleteness(-1), OutOfRangeException.OutOfRangeException()); //TC1
		assertEquals(Certificate.functionalCorrectness(0), 0); //TC2
		assertEquals(Certificate.functionalCorrectness(1), 0); //TC3
		assertEquals(Certificate.functionalCorrectness(9), 0); //TC4
		assertEquals(Certificate.functionalCorrectness(10), 1); //TC5
		assertEquals(Certificate.functionalCorrectness(11), 1); //TC6
		assertEquals(Certificate.functionalCorrectness(34), 1); //TC7
		assertEquals(Certificate.functionalCorrectness(35), 1); //TC8
		assertEquals(Certificate.functionalCorrectness(36), 1); //TC9
		assertEquals(Certificate.functionalCorrectness(49), 1); //TC10
		assertEquals(Certificate.functionalCorrectness(50), 2); //TC11
		assertEquals(Certificate.functionalCorrectness(51), 2); //TC12
		assertEquals(Certificate.functionalCorrectness(69), 2); //TC13
		assertEquals(Certificate.functionalCorrectness(70), 3); //TC14
		assertEquals(Certificate.functionalCorrectness(71), 3); //TC15
		assertEquals(Certificate.functionalCorrectness(89), 3); //TC16
		assertEquals(Certificate.functionalCorrectness(90), 5); //TC17
		assertEquals(Certificate.functionalCorrectness(91), 5); //TC18
		assertEquals(Certificate.functionalCorrectness(99), 5); //TC19
		assertEquals(Certificate.functionalCorrectness(100), 5); //TC20
		//assertEquals(Certificate.functionalCorrectness(101), OutOfRangeException.OutOfRangeException()); //TC21
	}
	
	@Test
	public void eachUsefunctionalAppropriateness() throws OutOfRangeException {
		//assertEquals(Certificate.functionalAppropriateness(-1), error); //TC1
		assertEquals(Certificate.functionalAppropriateness(0), 0); //TC2
		assertEquals(Certificate.functionalAppropriateness(1), 0); //TC3
		assertEquals(Certificate.functionalAppropriateness(9), 0); //TC4
		assertEquals(Certificate.functionalAppropriateness(10), 2); //TC5
		assertEquals(Certificate.functionalAppropriateness(11), 2); //TC6
		assertEquals(Certificate.functionalAppropriateness(34), 2); //TC7
		assertEquals(Certificate.functionalAppropriateness(35), 2); //TC8
		assertEquals(Certificate.functionalAppropriateness(36), 2); //TC9
		assertEquals(Certificate.functionalAppropriateness(49), 2); //TC10
		assertEquals(Certificate.functionalAppropriateness(50), 3); //TC11
		assertEquals(Certificate.functionalAppropriateness(51), 3); //TC12
		assertEquals(Certificate.functionalAppropriateness(69), 3); //TC13
		assertEquals(Certificate.functionalAppropriateness(70), 4); //TC14
		assertEquals(Certificate.functionalAppropriateness(71), 4); //TC15
		assertEquals(Certificate.functionalAppropriateness(89), 4); //TC16
		assertEquals(Certificate.functionalAppropriateness(90), 5); //TC17
		assertEquals(Certificate.functionalAppropriateness(91), 5); //TC18
		assertEquals(Certificate.functionalAppropriateness(99), 5); //TC19
		assertEquals(Certificate.functionalAppropriateness(100), 5); //TC20
		//assertEquals(Certificate.functionalAppropriateness(101), error); //TC21
	}
	
	/**
	 * PAIRWISE
	 * 
	 */
	
	@Test
	public void pairwisefunctionalSuitability() {
		assertEquals(new Certificate(0, 0, 0).functionalSuitability(), 0); //TC1
		assertEquals(new Certificate(10, 10, 0).functionalSuitability(), 0); //TC2
		assertEquals(new Certificate(35, 50, 0).functionalSuitability(), 0); //TC3
		assertEquals(new Certificate(70, 70, 0).functionalSuitability(), 0); //TC4
		assertEquals(new Certificate(90, 90, 0).functionalSuitability(), 0); //TC5
		assertEquals(new Certificate(35, 10, 10).functionalSuitability(), 1); //TC6
		assertEquals(new Certificate(70, 50, 10).functionalSuitability(), 2); //TC7
		assertEquals(new Certificate(90, 70, 10).functionalSuitability(), 2); //TC8
		assertEquals(new Certificate(0, 90, 10).functionalSuitability(), 0); //TC9
		assertEquals(new Certificate(10, 0, 10).functionalSuitability(), 0); //TC10
		assertEquals(new Certificate(90, 50, 50).functionalSuitability(), 2); //TC11
		assertEquals(new Certificate(0, 70, 50).functionalSuitability(), 0); //TC12
		assertEquals(new Certificate(10, 90, 50).functionalSuitability(), 1); //TC13
		assertEquals(new Certificate(35, 0, 50).functionalSuitability(), 0); //TC14
		assertEquals(new Certificate(70, 10, 50).functionalSuitability(), 1); //TC15
		assertEquals(new Certificate(10, 70, 70).functionalSuitability(), 1); //TC16
		assertEquals(new Certificate(35, 90, 70).functionalSuitability(), 2); //TC17
		assertEquals(new Certificate(70, 0, 70).functionalSuitability(), 0); //TC18
		assertEquals(new Certificate(90, 10, 70).functionalSuitability(), 1); //TC19
		assertEquals(new Certificate(0, 50, 70).functionalSuitability(), 0); //TC20
		assertEquals(new Certificate(70, 90, 90).functionalSuitability(), 3); //TC21
		assertEquals(new Certificate(90, 0, 90).functionalSuitability(), 0); //TC22
		assertEquals(new Certificate(0, 10, 90).functionalSuitability(), 0); //TC23
		assertEquals(new Certificate(10, 50, 90).functionalSuitability(), 1); //TC24
		assertEquals(new Certificate(35, 70, 90).functionalSuitability(), 2); //TC25
		
		//assertEquals(new Certificate(-1, 70, 90).functionalSuitability(), 2); //TC26
		//assertEquals(new Certificate(35, -1, 90).functionalSuitability(), 2); //TC27
		//assertEquals(new Certificate(35, 70, -1).functionalSuitability(), 2); //TC28
		//assertEquals(new Certificate(101, 70, 90).functionalSuitability(), 2); //TC29
		//assertEquals(new Certificate(35, 101, 90).functionalSuitability(), 2); //TC30
		//assertEquals(new Certificate(35, 70, 101).functionalSuitability(), 2); //TC31
		
	}
	
}
