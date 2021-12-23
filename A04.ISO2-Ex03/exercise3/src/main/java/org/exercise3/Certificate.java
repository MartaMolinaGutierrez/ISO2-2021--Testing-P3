package org.exercise3;

public class Certificate {
	FunctionalSuitability fSuitability;
	Maintainability maintainability;
	
	public Certificate(FunctionalSuitability fSuitability, Maintainability maintainability) {
		this.fSuitability = fSuitability;
		this.maintainability = maintainability;
	}
	
	int qualityLevel() {
		int quality = -1;
		int i = fSuitability.functionalSuitability();
		int j = maintainability.maintainability();
		
		try {
			quality = getQuality(i, j);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The measurements are incorrect, please correct them.");
			System.exit(0);
		}
		
		return quality;
	}
	
	int getQuality(int i, int j) throws ArrayIndexOutOfBoundsException{
		int[][] qualityMatrix = {
				{1, 1, 1, 1, 1},
				{1, 2, 2, 2, 2},
				{2, 2, 3, 3, 3},
				{3, 3, 3, 3, 4},
				{3, 3, 4, 4, 5}
		};
		
		return qualityMatrix[i - 1][j - 1];
	}
	
	boolean isCertifiable(int quality) {
		return (quality >= 3);
	}
}
