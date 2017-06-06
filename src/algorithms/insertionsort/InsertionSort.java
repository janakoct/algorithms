package algorithms.insertionsort;

public class InsertionSort {

	public void insertionSort(int[] arrayToBeSorted) {
		System.out.print("Unsorted Array : ");
		int arrayLength = arrayToBeSorted.length;
		printArray(arrayToBeSorted);
		for (int i = 0; i < arrayLength; i++) {
			int currentNumber = arrayToBeSorted[i];
			int j = i-1;
			while (j >= 0 && arrayToBeSorted[j] > currentNumber) {
				arrayToBeSorted[j+1] = arrayToBeSorted[j];
				j--;
			}
			arrayToBeSorted[j+1] = currentNumber;
		}
		System.out.print("Sorted Array   : ");
		printArray(arrayToBeSorted);
	}
	
	private void printArray(int[] arrayToBePrinted) {
		int arrayLength = arrayToBePrinted.length;
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(arrayToBePrinted[i] + " ");
		}
		System.out.println();
	}
}
