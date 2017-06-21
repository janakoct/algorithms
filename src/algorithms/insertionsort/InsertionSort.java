package algorithms.insertionsort;

import algorithms.mainpackage.UtilityClass;

public class InsertionSort {

	public void insertionSort(int[] arrayToBeSorted) {
		System.out.print("Unsorted Array : ");
		UtilityClass.printArray(arrayToBeSorted);
		int arrayLength = arrayToBeSorted.length;
		for (int i = 0; i < arrayLength; i++) {
			int currentNumber = arrayToBeSorted[i];
			int j = i - 1;
			while (j >= 0 && arrayToBeSorted[j] > currentNumber) {
				arrayToBeSorted[j + 1] = arrayToBeSorted[j];
				j--;
			}
			arrayToBeSorted[j + 1] = currentNumber;
		}
		System.out.print("Sorted Array   : ");
		UtilityClass.printArray(arrayToBeSorted);
	}
}
