package algorithms.bubblesort;

public class BubbleSort {

	public void bubbleSort(int[] arrayToBeSorted) {
		System.out.print("Unsorted Array : ");
		printArray(arrayToBeSorted);
		int arrayLength = arrayToBeSorted.length;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = 0; j < arrayLength - i - 1; j++) {
				if (arrayToBeSorted[j] > arrayToBeSorted[j + 1]) {
					int temp = arrayToBeSorted[j];
					arrayToBeSorted[j] = arrayToBeSorted[j+1];
					arrayToBeSorted[j+1] = temp;
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
