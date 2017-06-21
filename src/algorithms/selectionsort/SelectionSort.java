package algorithms.selectionsort;

import algorithms.mainpackage.UtilityClass;

public class SelectionSort {

	public void selectionSort(int[] arrayToBeSorted) {
		System.out.print("Unsorted Array : ");
		UtilityClass.printArray(arrayToBeSorted);
		int arrayLength = arrayToBeSorted.length;
		for (int i = 0; i < arrayLength - 1; i++) {
			int minimumIndex = i;
			for (int j = i + 1; j < arrayLength; j++) {
				if (arrayToBeSorted[j] < arrayToBeSorted[i]) {
					minimumIndex = j;
					int temp = arrayToBeSorted[minimumIndex];
					arrayToBeSorted[minimumIndex] = arrayToBeSorted[i];
					arrayToBeSorted[i] = temp;
				}
			}
		}
		System.out.print("Sorted Array   : ");
		UtilityClass.printArray(arrayToBeSorted);
	}
}
