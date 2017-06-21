package algorithms.mainpackage;

import algorithms.binarysearch.BinarySearch;
import algorithms.bubblesort.BubbleSort;
import algorithms.insertionsort.InsertionSort;
import algorithms.linearsearch.LinearSearch;
import algorithms.mergesort.MergeSort;
import algorithms.selectionsort.SelectionSort;

public class UtilityClass {

	public static void printArray(int[] arrayToBePrinted) {
		int arrayLength = arrayToBePrinted.length;
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(arrayToBePrinted[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Linear Search Block
	 */
	protected static void doLinearSearch() {
		int[] arrayToBeSearched = { 1, 4, 8, 35, 97, 85, 36, 54, 77, 42 };
		int[] numbersToBeSearchedInTheArray = { 0, 25, 89, 8, 40, 90, 72, 77 };
		LinearSearch linearSearch = new LinearSearch();
		for (int i = 0; i < numbersToBeSearchedInTheArray.length; i++) {
			int indexOfTheElementToSearch = linearSearch.linearSearch(arrayToBeSearched,
					numbersToBeSearchedInTheArray[i]);
			if (indexOfTheElementToSearch >= 0) {
				System.out.println(
						"Number " + numbersToBeSearchedInTheArray[i] + " found at index " + indexOfTheElementToSearch);
			} else {
				System.out.println("Element " + numbersToBeSearchedInTheArray[i] + " not found!");
			}
		}
	}

	/**
	 * Binary Search block
	 */
	protected static void doBinarySearchRecursive() {
		int[] sortedArray = { 1, 9, 45, 56, 89, 123, 456, 987 };
		int[] numbersToBeSearchedInTheArray = { 1, 987, 0, 777, 45, 89, 123, -25 };
		BinarySearch binarySearch = new BinarySearch();
		for (int i = 0; i < numbersToBeSearchedInTheArray.length; i++) {
			int indexOfTheElementToSearch = binarySearch.binarySearchRecursive(sortedArray, 0, sortedArray.length - 1,
					numbersToBeSearchedInTheArray[i]);
			if (indexOfTheElementToSearch >= 0) {
				System.out.println(
						"Number " + numbersToBeSearchedInTheArray[i] + " found at index " + indexOfTheElementToSearch);
			} else {
				System.out.println("Element " + numbersToBeSearchedInTheArray[i] + " not found!");
			}
		}
	}

	protected static void doBinarySearchIterative() {
		int[] sortedArray = { 1, 9, 45, 56, 89, 123, 456, 987 };
		int[] numbersToBeSearchedInTheArray = { 1, 987, 0, 777, 45, 89, 123, -25 };
		BinarySearch binarySearch = new BinarySearch();
		for (int i = 0; i < numbersToBeSearchedInTheArray.length; i++) {
			int indexOfTheElementToSearch = binarySearch.binarySearchIterative(sortedArray, 0, sortedArray.length - 1,
					numbersToBeSearchedInTheArray[i]);
			if (indexOfTheElementToSearch >= 0) {
				System.out.println(
						"Number " + numbersToBeSearchedInTheArray[i] + " found at index " + indexOfTheElementToSearch);
			} else {
				System.out.println("Element " + numbersToBeSearchedInTheArray[i] + " not found!");
			}
		}
	}

	protected static void doSelectionSort() {
		int[] arrayToBeSorted1 = { 91, 90, 89, 76, 64, 53, 48, 37, 28, 19, 1 };
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort(arrayToBeSorted1);

		int[] arrayToBeSorted2 = { -43, -69, 0, -347, 800, 93, 1, -4 };
		selectionSort.selectionSort(arrayToBeSorted2);
	}

	protected static void doBubbleSort() {
		int[] arrayToBeSorted1 = { 91, 90, 89, 76, 64, 53, 48, 37, 28, 19, 1 };
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(arrayToBeSorted1);

		int[] arrayToBeSorted2 = { -43, -69, 0, -347, 800, 93, 1, -4 };
		bubbleSort.bubbleSort(arrayToBeSorted2);
	}

	protected static void doInsertionSort() {
		int[] arrayToBeSorted1 = { 91, 90, 89, 76, 64, 53, 48, 37, 28, 19, 1 };
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(arrayToBeSorted1);

		int[] arrayToBeSorted2 = { -43, -69, 0, -347, 800, 93, 1, -4 };
		insertionSort.insertionSort(arrayToBeSorted2);
	}
	
	protected static void doMergeSort() {
		
		int[] arrayToBeSorted1 = { 91, 90, 89, 76, 64, 53, 48, 37, 28, 19, 1 };
		System.out.print("Unsorted Array : ");
		UtilityClass.printArray(arrayToBeSorted1);
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(arrayToBeSorted1, 0, arrayToBeSorted1.length - 1);
		System.out.print("Sorted Array : ");
		UtilityClass.printArray(arrayToBeSorted1);

		int[] arrayToBeSorted2 = { -43, -69, 0, -347, 800, 93, 1, -4 };
		System.out.print("Unsorted Array : ");
		UtilityClass.printArray(arrayToBeSorted2);
		mergeSort.mergeSort(arrayToBeSorted2,0, arrayToBeSorted2.length - 1);
		System.out.print("Sorted Array : ");
		UtilityClass.printArray(arrayToBeSorted2);
	}
}
