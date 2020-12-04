package com.aitorgonzalez.algos.sem;

public class SiguienteElementoMayor {

	public static void main(String[] args) {
		
		//Test data
		SiguienteElementoMayor sem = new SiguienteElementoMayor();
		int[] arrIn1 = new int[] { 4, 5, 2, 25 };
		int[] arrIn2 = new int[] { 13, 7, 6, 12 };
		int[] arrIn3 = new int[] { -4, -20, -7, 10, 7, 16 };
		int[] arrIn4 = new int[0];
		
		sem.getNextMajorElements(arrIn1);
		sem.getNextMajorElements(arrIn2);
		sem.getNextMajorElements(arrIn3);
		sem.getNextMajorElements(arrIn4);
		sem.getNextMajorElements(null);
	}

	/**
	 * Complexity of the algorithm is O(n*(m-n)) => which is still O(N^2) because we are looping an array inside an array.
	 * I have choosen to use arrays because we are not performing any kind of add or get operation or any kind of sorting.
	 * And because the iterations over the inner for decrease on each step there is no need for dynamic programming or storing
	 * previous values. 
	 * @param array the input array.
	 * @return the output array.
	 */
	public int[] getNextMajorElements(int[] inputArray) {
		
		//If the array is null or empty, I return an empty array (this is arbitrary because there was
		//no specified requirement
		if (inputArray == null)
			return new int[0];
		if (inputArray.length == 0)
			return inputArray;
		System.out.printf("Elemento\t--->\tSEM%n");

		//I initialize the output array, it will always have the same size as the input array
		int[] resultArray = new int[inputArray.length];
		
		//Iterate over the array
		for (int i = 0; i < inputArray.length; i++) {
			int currentElement = inputArray[i];
			
			//Initialize the Next Major Element as -1, assuming that we are not going to find any 
			//Next Major Element
			int nextMajorElement = -1;
			
			//Iterates over the following possition of the array to look for a Major element than the current one
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j] > currentElement) {
					//If we find a major element, it stores it and gets out of the inner loop because there
					//is no need to keep iterating
					nextMajorElement = inputArray[j];
					break;
				}
			}
			
			//Sets the Next Major Element to the result array on the current possition 
			resultArray[i] = nextMajorElement;
			System.out.printf("%d\t\t--->\t\t%d%n", currentElement, nextMajorElement);
		}

		return resultArray;
	}

}
