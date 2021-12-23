package org.exercise3;

public class Certificate {
	
int measureCompleteness, measureCorrectness, measureAppropriateness;
	
	public Certificate(int measureCompleteness, int measureCorrectness, int measureAppropriateness) {
		this.measureCompleteness = measureCompleteness;
		this.measureCorrectness = measureCorrectness;
		this.measureAppropriateness = measureAppropriateness;
	}
	
	int functionalSuitability() {
		try {
			int fCompleteness = functionalCompleteness(this.measureCompleteness);
			int fCorrectness = functionalCorrectness(this.measureCorrectness);
			int fAppropriateness = functionalAppropriateness(this.measureAppropriateness);
			
			if(fCompleteness <= fCorrectness && fCompleteness <= fAppropriateness) {
				return fCompleteness;
			} else if(fCorrectness <= fAppropriateness) {
				return fCorrectness;
			} else {
				return fAppropriateness;
			}
			
		} catch(OutOfRangeException e) {
			System.out.println("The measurements are incorrect, please correct them.");
			System.exit(0);
		}
		
		return 0;
	}
	
	static int functionalCompleteness(int measurement) throws OutOfRangeException {
		if(measurement < 0) {
			throw new OutOfRangeException();
		} else if(measurement < 10) {
			return 0;
		} else if(measurement < 35) {
			return 1;
		} else if(measurement < 70) {
			return 2;
		} else if(measurement < 90) {
			return 3;
		} else if(measurement <= 100) {
			return 4;
		} else {
			throw new OutOfRangeException();
		}
	}
	
	static int functionalCorrectness(int measurement) throws OutOfRangeException {
		if(measurement < 0) {
			throw new OutOfRangeException();
		} else if(measurement < 10) {
			return 0;
		} else if(measurement < 50) {
			return 1;
		} else if(measurement < 70) {
			return 2;
		} else if(measurement < 90) {
			return 3;
		} else if(measurement <= 100) {
			return 5;
		} else {
			throw new OutOfRangeException();
		}
	}
	
	static int functionalAppropriateness(int measurement) throws OutOfRangeException {
		if(measurement < 0) {
			throw new OutOfRangeException();
		} else if(measurement < 10) {
			return 0;
		} else if(measurement < 50) {
			return 2;
		} else if(measurement < 70) {
			return 3;
		} else if(measurement < 90) {
			return 4;
		} else if(measurement <= 100) {
			return 5;
		} else {
			throw new OutOfRangeException();
		}
	}
}
