package algorithms.selectionsort;

public class SelectionSort {

	public void selectionSort(int[] arrayToBeSorted) {
		System.out.print("Unsorted Array : ");
		printArray(arrayToBeSorted);
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
