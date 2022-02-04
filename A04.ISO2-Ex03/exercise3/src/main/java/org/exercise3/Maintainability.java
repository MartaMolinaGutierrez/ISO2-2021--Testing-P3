package org.exercise3;

public class Maintainability {
	/**
	 * Some description here.
	 */
	int mModularity;
	/**
	 * Some description here.
	 */
	int mReusability;
	/**
	 * Some description here.
	 */
	int mAnalyizability;
	/**
	 * Some description here.
	 */
	int mModified;
	/**
	 * Some description here.
	 */
	int mTested;

	/**
	 * Some description here.
	 * @param mModularity
	 * @param mReusability
	 * @param mAnalyizability
	 * @param mModified
	 * @param mTested
	 */
	public Maintainability(int mModularity, int mReusability,
			int mAnalyizability, int mModified, int mTested) {
		this.mModularity = mModularity;
		this.mReusability = mReusability;
		this.mAnalyizability = mAnalyizability;
		this.mModified = mModified;
		this.mTested = mTested;
	}

	/**
	 * Some description here.
	 * @return integer
	 */
	int maintainability() {
		try {
			int modularity = modularity(this.mModularity);
			int reusability = reusability(this.mReusability);
			int analyzability = analyzability(this.mAnalyizability);
			int modified = modified(this.mModified);
			int tested = tested(this.mTested);

			if (modularity <= reusability
					&& modularity <= analyzability
					&& modularity <= modified
					&& modularity <= tested) {
				return modularity;
			} else if (reusability <= analyzability
					&& reusability <= modified
					&& reusability <= tested) {
				return reusability;
			} else if (analyzability <= modified
					&& analyzability <= tested) {
				return analyzability;
			} else if (modified <= tested) {
				return modified;
			} else {
				return tested;
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
	static int modularity(int measurement)
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
	 * @throws OutOfRangeException
	 */
	static int reusability(int measurement) throws OutOfRangeException {
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
	static int analyzability(int measurement)
			throws OutOfRangeException {
		if (measurement < 0) {
			throw new OutOfRangeException();
		} else if (measurement < 35) {
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
	static int modified(int measurement)
			throws OutOfRangeException {
		if (measurement < 0) {
			throw new OutOfRangeException();
		} else if (measurement < 10) {
			return 0;
		} else if (measurement < 35) {
			return 1;
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

	/**
	 * Some description here.
	 * @param measurement
	 * @return integer
	 */
	static int tested(int measurement)
			throws OutOfRangeException {
		if (measurement < 0) {
			throw new OutOfRangeException();
		} else if (measurement < 10) {
			return 0;
		} else if (measurement < 50) {
			return 1;
		} else if (measurement < 70) {
			return 2;
		} else if (measurement <= 100) {
			return 4;
		} else {
			throw new OutOfRangeException();
		}
	}
}
