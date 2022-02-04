package org.exercise3;

public class Certificate {
	/**
	 * Some description here.
	 */
	FunctionalSuitability fSuitability;
	/**
	 * Some description here.
	 */
	Maintainability maintainability;

	/**
	 * Some description here.
	 * @param fSuitability
	 * @param maintainability
	 */
	public Certificate(FunctionalSuitability fSuitability,
			Maintainability maintainability) {

		this.fSuitability = fSuitability;
		this.maintainability = maintainability;
	}

	/**
	 * Some description here.
	 * @return quality int
	 */
	int qualityLevel() {
		int quality = -1;
		int i = fSuitability.functionalSuitability();
		int j = maintainability.maintainability();

		try {
			quality = getQuality(i, j);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The measurements are incorrect, "
					+ "please correct them.");
			System.exit(0);
		}

		return quality;
	}

	/**
	 * Some description here.
	 * @param i
	 * @param j
	 * @return qualityMatrix int[][]
	 * @throws ArrayIndexOutOfBoundsException
	 */
	int getQuality(int i, int j) throws ArrayIndexOutOfBoundsException {
		int[][] qualityMatrix = {
				{1, 1, 1, 1, 1},
				{1, 2, 2, 2, 2},
				{2, 2, 3, 3, 3},
				{3, 3, 3, 3, 4},
				{3, 3, 4, 4, 5}
		};

		return qualityMatrix[i - 1][j - 1];
	}

	/**
	 * Some description here.
	 * @param quality
	 * @return booleano
	 */
	boolean isCertifiable(int quality) {
		return (quality >= 3);
	}
}
