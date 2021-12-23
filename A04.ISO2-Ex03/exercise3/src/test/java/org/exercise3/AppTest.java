package org.exercise3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.exercise3.*;

/**
 * Unit test for simple App.
 */


/**
 * We decided to include test cases with and without nulls, to observe the difference in the results when testing.
 */

public class AppTest 
{	
	
	/**
	 * EACH USE COVERAGE
	 * @throws OutOfRangeException 
	 */
	
	@Test
	public void eachUsefunctionalCompleteness() throws OutOfRangeException {
		//assertEquals(FunctionalSuitability.functionalCompleteness(-1), error); //TC1
		assertEquals(FunctionalSuitability.functionalCompleteness(0), 0); //TC2
		assertEquals(FunctionalSuitability.functionalCompleteness(1), 0); //TC3
		assertEquals(FunctionalSuitability.functionalCompleteness(9), 0); //TC4
		assertEquals(FunctionalSuitability.functionalCompleteness(10), 1); //TC5
		assertEquals(FunctionalSuitability.functionalCompleteness(11), 1); //TC6
		assertEquals(FunctionalSuitability.functionalCompleteness(34), 1); //TC7
		assertEquals(FunctionalSuitability.functionalCompleteness(35), 2); //TC8
		assertEquals(FunctionalSuitability.functionalCompleteness(36), 2); //TC9
		assertEquals(FunctionalSuitability.functionalCompleteness(49), 2); //TC10
		assertEquals(FunctionalSuitability.functionalCompleteness(50), 2); //TC11
		assertEquals(FunctionalSuitability.functionalCompleteness(51), 2); //TC12
		assertEquals(FunctionalSuitability.functionalCompleteness(69), 2); //TC13
		assertEquals(FunctionalSuitability.functionalCompleteness(70), 3); //TC14
		assertEquals(FunctionalSuitability.functionalCompleteness(71), 3); //TC15
		assertEquals(FunctionalSuitability.functionalCompleteness(89), 3); //TC16
		assertEquals(FunctionalSuitability.functionalCompleteness(90), 4); //TC17
		assertEquals(FunctionalSuitability.functionalCompleteness(91), 4); //TC18
		assertEquals(FunctionalSuitability.functionalCompleteness(99), 4); //TC19
		assertEquals(FunctionalSuitability.functionalCompleteness(100), 4); //TC20
		//assertEquals(FunctionalSuitability.functionalCompleteness(101), error); //TC21
	}
	
	@Test
	public void eachUsefunctionalCorrectness() throws OutOfRangeException {
		//assertEquals(FunctionalSuitability.functionalCompleteness(-1), OutOfRangeException.OutOfRangeException()); //TC1
		assertEquals(FunctionalSuitability.functionalCorrectness(0), 0); //TC2
		assertEquals(FunctionalSuitability.functionalCorrectness(1), 0); //TC3
		assertEquals(FunctionalSuitability.functionalCorrectness(9), 0); //TC4
		assertEquals(FunctionalSuitability.functionalCorrectness(10), 1); //TC5
		assertEquals(FunctionalSuitability.functionalCorrectness(11), 1); //TC6
		assertEquals(FunctionalSuitability.functionalCorrectness(34), 1); //TC7
		assertEquals(FunctionalSuitability.functionalCorrectness(35), 1); //TC8
		assertEquals(FunctionalSuitability.functionalCorrectness(36), 1); //TC9
		assertEquals(FunctionalSuitability.functionalCorrectness(49), 1); //TC10
		assertEquals(FunctionalSuitability.functionalCorrectness(50), 2); //TC11
		assertEquals(FunctionalSuitability.functionalCorrectness(51), 2); //TC12
		assertEquals(FunctionalSuitability.functionalCorrectness(69), 2); //TC13
		assertEquals(FunctionalSuitability.functionalCorrectness(70), 3); //TC14
		assertEquals(FunctionalSuitability.functionalCorrectness(71), 3); //TC15
		assertEquals(FunctionalSuitability.functionalCorrectness(89), 3); //TC16
		assertEquals(FunctionalSuitability.functionalCorrectness(90), 5); //TC17
		assertEquals(FunctionalSuitability.functionalCorrectness(91), 5); //TC18
		assertEquals(FunctionalSuitability.functionalCorrectness(99), 5); //TC19
		assertEquals(FunctionalSuitability.functionalCorrectness(100), 5); //TC20
		//assertEquals(FunctionalSuitability.functionalCorrectness(101), OutOfRangeException.OutOfRangeException()); //TC21
	}
	
	@Test
	public void eachUsefunctionalAppropriateness() throws OutOfRangeException {
		//assertEquals(FunctionalSuitability.functionalAppropriateness(-1), error); //TC1
		assertEquals(FunctionalSuitability.functionalAppropriateness(0), 0); //TC2
		assertEquals(FunctionalSuitability.functionalAppropriateness(1), 0); //TC3
		assertEquals(FunctionalSuitability.functionalAppropriateness(9), 0); //TC4
		assertEquals(FunctionalSuitability.functionalAppropriateness(10), 2); //TC5
		assertEquals(FunctionalSuitability.functionalAppropriateness(11), 2); //TC6
		assertEquals(FunctionalSuitability.functionalAppropriateness(34), 2); //TC7
		assertEquals(FunctionalSuitability.functionalAppropriateness(35), 2); //TC8
		assertEquals(FunctionalSuitability.functionalAppropriateness(36), 2); //TC9
		assertEquals(FunctionalSuitability.functionalAppropriateness(49), 2); //TC10
		assertEquals(FunctionalSuitability.functionalAppropriateness(50), 3); //TC11
		assertEquals(FunctionalSuitability.functionalAppropriateness(51), 3); //TC12
		assertEquals(FunctionalSuitability.functionalAppropriateness(69), 3); //TC13
		assertEquals(FunctionalSuitability.functionalAppropriateness(70), 4); //TC14
		assertEquals(FunctionalSuitability.functionalAppropriateness(71), 4); //TC15
		assertEquals(FunctionalSuitability.functionalAppropriateness(89), 4); //TC16
		assertEquals(FunctionalSuitability.functionalAppropriateness(90), 5); //TC17
		assertEquals(FunctionalSuitability.functionalAppropriateness(91), 5); //TC18
		assertEquals(FunctionalSuitability.functionalAppropriateness(99), 5); //TC19
		assertEquals(FunctionalSuitability.functionalAppropriateness(100), 5); //TC20
		//assertEquals(FunctionalSuitability.functionalAppropriateness(101), error); //TC21
	}
	
	/**
	 * PAIRWISE
	 * 
	 */
	
	@Test
	public void pairwisefunctionalSuitability() {
		assertEquals(new FunctionalSuitability(0, 0, 0).functionalSuitability(), 0); //TC1
		assertEquals(new FunctionalSuitability(10, 10, 0).functionalSuitability(), 0); //TC2
		assertEquals(new FunctionalSuitability(35, 50, 0).functionalSuitability(), 0); //TC3
		assertEquals(new FunctionalSuitability(70, 70, 0).functionalSuitability(), 0); //TC4
		assertEquals(new FunctionalSuitability(90, 90, 0).functionalSuitability(), 0); //TC5
		assertEquals(new FunctionalSuitability(35, 10, 10).functionalSuitability(), 1); //TC6
		assertEquals(new FunctionalSuitability(70, 50, 10).functionalSuitability(), 2); //TC7
		assertEquals(new FunctionalSuitability(90, 70, 10).functionalSuitability(), 2); //TC8
		assertEquals(new FunctionalSuitability(0, 90, 10).functionalSuitability(), 0); //TC9
		assertEquals(new FunctionalSuitability(10, 0, 10).functionalSuitability(), 0); //TC10
		assertEquals(new FunctionalSuitability(90, 50, 50).functionalSuitability(), 2); //TC11
		assertEquals(new FunctionalSuitability(0, 70, 50).functionalSuitability(), 0); //TC12
		assertEquals(new FunctionalSuitability(10, 90, 50).functionalSuitability(), 1); //TC13
		assertEquals(new FunctionalSuitability(35, 0, 50).functionalSuitability(), 0); //TC14
		assertEquals(new FunctionalSuitability(70, 10, 50).functionalSuitability(), 1); //TC15
		assertEquals(new FunctionalSuitability(10, 70, 70).functionalSuitability(), 1); //TC16
		assertEquals(new FunctionalSuitability(35, 90, 70).functionalSuitability(), 2); //TC17
		assertEquals(new FunctionalSuitability(70, 0, 70).functionalSuitability(), 0); //TC18
		assertEquals(new FunctionalSuitability(90, 10, 70).functionalSuitability(), 1); //TC19
		assertEquals(new FunctionalSuitability(0, 50, 70).functionalSuitability(), 0); //TC20
		assertEquals(new FunctionalSuitability(70, 90, 90).functionalSuitability(), 3); //TC21
		assertEquals(new FunctionalSuitability(90, 0, 90).functionalSuitability(), 0); //TC22
		assertEquals(new FunctionalSuitability(0, 10, 90).functionalSuitability(), 0); //TC23
		assertEquals(new FunctionalSuitability(10, 50, 90).functionalSuitability(), 1); //TC24
		assertEquals(new FunctionalSuitability(35, 70, 90).functionalSuitability(), 2); //TC25
		
		//assertEquals(new FunctionalSuitability(-1, 70, 90).functionalSuitability(), 2); //TC26
		//assertEquals(new FunctionalSuitability(35, -1, 90).functionalSuitability(), 2); //TC27
		//assertEquals(new FunctionalSuitability(35, 70, -1).functionalSuitability(), 2); //TC28
		//assertEquals(new FunctionalSuitability(101, 70, 90).functionalSuitability(), 2); //TC29
		//assertEquals(new FunctionalSuitability(35, 101, 90).functionalSuitability(), 2); //TC30
		//assertEquals(new FunctionalSuitability(35, 70, 101).functionalSuitability(), 2); //TC31
		
	}
	@Test
	public void pairwisemaintainability() {
		assertEquals(new Maintainability(0, 0, 0, 0, 0).maintainability(), 0); //TC1
		assertEquals(new Maintainability(0, 10, 0, 10, 10).maintainability(), 0); //TC2
		assertEquals(new Maintainability(0, 35, 35, 35, 35).maintainability(), 0); //TC3
		assertEquals(new Maintainability(0, 35, 50, 50, 50).maintainability(), 0); //TC4
		assertEquals(new Maintainability(0, 70, 70, 70, 70).maintainability(), 0); //TC5
		assertEquals(new Maintainability(0, 90, 90, 90, 90).maintainability(), 0); //TC6
		assertEquals(new Maintainability(10, 10, 35, 50, 70).maintainability(), 1); //TC7
		assertEquals(new Maintainability(10, 35, 50, 70, 70).maintainability(), 1); //TC8
		assertEquals(new Maintainability(10, 35, 70, 90, 0).maintainability(), 0); //TC9
		assertEquals(new Maintainability(10, 70, 90, 0, 10).maintainability(), 0); //TC10
		assertEquals(new Maintainability(10, 90, 0, 10, 10).maintainability(), 0); //TC11
		assertEquals(new Maintainability(10, 0, 0, 35, 50).maintainability(), 0); //TC12
		assertEquals(new Maintainability(35, 35, 70, 0, 10).maintainability(), 0); //TC13
		assertEquals(new Maintainability(35, 35, 90, 10, 50).maintainability(), 1); //TC14
		assertEquals(new Maintainability(35, 0, 35, 70, 0).maintainability(), 0); //TC15
		assertEquals(new Maintainability(35, 10, 50, 90, 10).maintainability(), 1); //TC16
		assertEquals(new Maintainability(35, 35, 0, 50, 0).maintainability(), 0); //TC17
		assertEquals(new Maintainability(35, 70, 0, 70, 10).maintainability(), 0); //TC18
		assertEquals(new Maintainability(35, 90, 35, 90, 10).maintainability(), 1); //TC19
		assertEquals(new Maintainability(35, 0, 50, 0, 50).maintainability(), 0); //TC20
		assertEquals(new Maintainability(35, 10, 70, 10, 70).maintainability(), 1); //TC21
		assertEquals(new Maintainability(35, 35, 90, 35, 70).maintainability(), 2); //TC22
		assertEquals(new Maintainability(70, 70, 35, 0, 70).maintainability(), 0); //TC23
		assertEquals(new Maintainability(70, 90, 50, 10, 70).maintainability(), 1); //TC24
		assertEquals(new Maintainability(70, 0, 70, 35, 0).maintainability(), 0); //TC25
		assertEquals(new Maintainability(70, 10, 90, 50, 10).maintainability(), 1); //TC26
		assertEquals(new Maintainability(70, 35, 0, 70, 10).maintainability(), 0); //TC27
		assertEquals(new Maintainability(70, 35, 0, 90, 50).maintainability(), 0); //TC28
		assertEquals(new Maintainability(90, 90, 70, 50, 10).maintainability(), 1); //TC29
		assertEquals(new Maintainability(90, 0, 90, 70, 50).maintainability(), 0); //TC30
		assertEquals(new Maintainability(90, 10, 0, 90, 70).maintainability(), 0); //TC31
		assertEquals(new Maintainability(90, 35, 0, 0, 70).maintainability(), 0); //TC32
		assertEquals(new Maintainability(90, 35, 35, 10, 0).maintainability(), 0); //TC33
		assertEquals(new Maintainability(90, 70, 50, 35, 10).maintainability(), 1); //TC34
	}
	
	@Test
	public void eachUsemodularity() throws OutOfRangeException {
		assertEquals(Maintainability.modularity(0), 0); //TC2
		assertEquals(Maintainability.modularity(1), 0); //TC3
		assertEquals(Maintainability.modularity(9), 0); //TC4
		assertEquals(Maintainability.modularity(10), 1); //TC5
		assertEquals(Maintainability.modularity(11), 1); //TC6
		assertEquals(Maintainability.modularity(34), 1); //TC7
		assertEquals(Maintainability.modularity(35), 2); //TC8
		assertEquals(Maintainability.modularity(36), 2); //TC9
		assertEquals(Maintainability.modularity(49), 2); //TC10
		assertEquals(Maintainability.modularity(50), 2); //TC11
		assertEquals(Maintainability.modularity(51), 2); //TC12
		assertEquals(Maintainability.modularity(69), 2); //TC13
		assertEquals(Maintainability.modularity(70), 3); //TC14
		assertEquals(Maintainability.modularity(71), 3); //TC15
		assertEquals(Maintainability.modularity(89), 3); //TC16
		assertEquals(Maintainability.modularity(90), 4); //TC17
		assertEquals(Maintainability.modularity(91), 4); //TC18
		assertEquals(Maintainability.modularity(99), 4); //TC19
		assertEquals(Maintainability.modularity(100), 4); //TC20
	}
	@Test
	public void eachUsereusability() throws OutOfRangeException {	
		assertEquals(Maintainability.reusability(0), 0); //TC2
		assertEquals(Maintainability.reusability(1), 0); //TC3
		assertEquals(Maintainability.reusability(9), 0); //TC4
		assertEquals(Maintainability.reusability(10), 1); //TC5
		assertEquals(Maintainability.reusability(11), 1); //TC6
		assertEquals(Maintainability.reusability(34), 1); //TC7
		assertEquals(Maintainability.reusability(35), 2); //TC8
		assertEquals(Maintainability.reusability(36), 2); //TC9
		assertEquals(Maintainability.reusability(49), 2); //TC10
		assertEquals(Maintainability.reusability(50), 2); //TC11
		assertEquals(Maintainability.reusability(51), 2); //TC12
		assertEquals(Maintainability.reusability(69), 2); //TC13
		assertEquals(Maintainability.reusability(70), 3); //TC14
		assertEquals(Maintainability.reusability(71), 3); //TC15
		assertEquals(Maintainability.reusability(89), 3); //TC16
		assertEquals(Maintainability.reusability(90), 5); //TC17
		assertEquals(Maintainability.reusability(91), 5); //TC18
		assertEquals(Maintainability.reusability(99), 5); //TC19
		assertEquals(Maintainability.reusability(100), 5); //TC20
	}
	@Test
	public void eachUseanalyzability() throws OutOfRangeException {
		assertEquals(Maintainability.analyzability(0), 0); //TC2
		assertEquals(Maintainability.analyzability(1), 0); //TC3
		assertEquals(Maintainability.analyzability(9), 0); //TC4
		assertEquals(Maintainability.analyzability(10), 0); //TC5
		assertEquals(Maintainability.analyzability(11), 0); //TC6
		assertEquals(Maintainability.analyzability(34), 0); //TC7
		assertEquals(Maintainability.analyzability(35), 1); //TC8
		assertEquals(Maintainability.analyzability(36), 1); //TC9
		assertEquals(Maintainability.analyzability(49), 1); //TC10
		assertEquals(Maintainability.analyzability(50), 2); //TC11
		assertEquals(Maintainability.analyzability(51), 2); //TC12
		assertEquals(Maintainability.analyzability(69), 2); //TC13
		assertEquals(Maintainability.analyzability(70), 3); //TC14
		assertEquals(Maintainability.analyzability(71), 3); //TC15
		assertEquals(Maintainability.analyzability(89), 3); //TC16
		assertEquals(Maintainability.analyzability(90), 5); //TC17
		assertEquals(Maintainability.analyzability(91), 5); //TC18
		assertEquals(Maintainability.analyzability(99), 5); //TC19
		assertEquals(Maintainability.analyzability(100), 5); //TC20
	}
	@Test
	public void eachUsemodified() throws OutOfRangeException {
		assertEquals(Maintainability.modified(0), 0); //TC2
		assertEquals(Maintainability.modified(1), 0); //TC3
		assertEquals(Maintainability.modified(9), 0); //TC4
		assertEquals(Maintainability.modified(10), 1); //TC5
		assertEquals(Maintainability.modified(11), 1); //TC6
		assertEquals(Maintainability.modified(34), 1); //TC7
		assertEquals(Maintainability.modified(35), 2); //TC8
		assertEquals(Maintainability.modified(36), 2); //TC9
		assertEquals(Maintainability.modified(49), 2); //TC10
		assertEquals(Maintainability.modified(50), 3); //TC11
		assertEquals(Maintainability.modified(51), 3); //TC12
		assertEquals(Maintainability.modified(69), 3); //TC13
		assertEquals(Maintainability.modified(70), 4); //TC14
		assertEquals(Maintainability.modified(71), 4); //TC15
		assertEquals(Maintainability.modified(89), 4); //TC16
		assertEquals(Maintainability.modified(90), 5); //TC17
		assertEquals(Maintainability.modified(91), 5); //TC18
		assertEquals(Maintainability.modified(99), 5); //TC19
		assertEquals(Maintainability.modified(100), 5); //TC20
	}
	@Test
	public void eachUsetested() throws OutOfRangeException {
		assertEquals(Maintainability.tested(0), 0); //TC2
		assertEquals(Maintainability.tested(1), 0); //TC3
		assertEquals(Maintainability.tested(9), 0); //TC4
		assertEquals(Maintainability.tested(10), 1); //TC5
		assertEquals(Maintainability.tested(11), 1); //TC6
		assertEquals(Maintainability.tested(34), 1); //TC7
		assertEquals(Maintainability.tested(35), 1); //TC8
		assertEquals(Maintainability.tested(36), 1); //TC9
		assertEquals(Maintainability.tested(49), 1); //TC10
		assertEquals(Maintainability.tested(50), 2); //TC11
		assertEquals(Maintainability.tested(51), 2); //TC12
		assertEquals(Maintainability.tested(69), 2); //TC13
		assertEquals(Maintainability.tested(70), 4); //TC14
		assertEquals(Maintainability.tested(71), 4); //TC15
		assertEquals(Maintainability.tested(89), 4); //TC16
		assertEquals(Maintainability.tested(90), 4); //TC17
		assertEquals(Maintainability.tested(91), 4); //TC18
		assertEquals(Maintainability.tested(99), 4); //TC19
		assertEquals(Maintainability.tested(100), 4); //TC20
	}
	
	
	
	
}