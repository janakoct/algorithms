package algorithms.mainpackage;

import algorithms.linearsearch.LinearSearch;

public class UtilityClass {

	protected static void doLinearSearch() {
		/**
		 * Linear Search Block
		 */
		int[] arrayToBeSearched = {1, 4, 8, 35, 97, 85, 36, 54, 77, 42};
		int[] numbersToBeSearchedInTheArray = {0, 25, 89, 8, 40, 90, 72, 77};
		LinearSearch linearSearch = new LinearSearch();
		for(int i = 0; i < numbersToBeSearchedInTheArray.length; i++) {
			int indexOfTheElementToSearch = linearSearch.linearSearch(arrayToBeSearched, numbersToBeSearchedInTheArray[i]);
			if(indexOfTheElementToSearch >= 0) {
				System.out.println("Number " + numbersToBeSearchedInTheArray[i] + " found at index " + indexOfTheElementToSearch);
			} else {
				System.out.println("Element not found!");
			}
		}
	}
}
