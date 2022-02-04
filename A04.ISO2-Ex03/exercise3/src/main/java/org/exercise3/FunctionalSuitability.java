package org.exercise3;

public class FunctionalSuitability {
	/**
	 * Some description here.
	 */
	int measureCompleteness;
	/**
	 * Some description here.
	 */
	int measureCorrectness;
	/**
	 * Some description here.
	 */
	int measureAppropriateness;

	/**
	 * Some description here.
	 * @param measureCompleteness
	 * @param measureCorrectness
	 * @param measureAppropriateness
	 */
	public FunctionalSuitability(int measureCompleteness,
			int measureCorrectness, int measureAppropriateness) {
		this.measureCompleteness = measureCompleteness;
		this.measureCorrectness = measureCorrectness;
		this.measureAppropriateness = measureAppropriateness;
	}

	/**
	 * Some description here.
	 * @return integer
	 */
	int functionalSuitability() {
		try {
			int fCompleteness = functionalCompleteness
					(this.measureCompleteness);
			int fCorrectness = functionalCorrectness
					(this.measureCorrectness);
			int fAppropriateness = functionalAppropriateness
					(this.measureAppropriateness);

			if (fCompleteness < fCorrectness
					&& fCompleteness < fAppropriateness) {
				return fCompleteness;
			} else if (fCorrectness < fAppropriateness) {
				return fCorrectness;
			} else {
				return fAppropriateness;
			}

		} catch (OutOfRangeException e) {
			System.out.println("The measurements are incorrect,"
					+ " please correct them.");
			System.exit(0);
		}

		return 0;
	}

	/**
	 * Some description here.
	 * @param measurement
	 * @return integer
	 */
	static int functionalCompleteness(int measurement)
			throws OutOfRangeException {
		if (measurement < 0) {
			throw new OutOfRangeException();
		} else if (measurement < 10) {
			return 0;
		} else if (measurement < 35) {
			return 1;
		} else if (measurement < 70) {
			return 2;
		} else if (measurement < 90) {
			return 3;
		} else if (measurement <= 100) {
			return 4;
		} else {
			throw new OutOfRangeException();
		}
	}

	/**
	 * Some description here.
	 * @param measurement
	 * @return integer
	 */
	static int functionalCorrectness(int measurement)
			throws OutOfRangeException {
		if (measurement < 0) {
			throw new OutOfRangeException();
		} else if (measurement < 10) {
			return 0;
		} else if (measurement < 50) {
			return 1;
		} else if (measurement < 70) {
			return 2;
		} else if (measurement < 90) {
			return 3;
		} else if (measurement <= 100) {
			return 5;
		} else {
			throw new OutOfRangeException();
		}
	}

	/**
	 * Some description here.
	 * @param measurement
	 * @return integer
	 */
	static int functionalAppropriateness(int measurement)
			throws OutOfRangeException {
		if (measurement < 0) {
			throw new OutOfRangeException();
		} else if (measurement < 10) {
			return 0;
		} else if (measurement < 50) {
			return 2;
		} else if (measurement < 70) {
			return 3;
		} else if (measurement < 90) {
			return 4;
		} else if (measurement <= 100) {
			return 5;
		} else {
			throw new OutOfRangeException();
		}
	}
}
