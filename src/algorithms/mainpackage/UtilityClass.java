package algorithms.mainpackage;

import algorithms.binarysearch.BinarySearch;
import algorithms.linearsearch.LinearSearch;
import algorithms.selectionsort.SelectionSort;

public class UtilityClass {

	/**
	 * Linear Search Block
	 */
	protected static void doLinearSearch() {
		int[] arrayToBeSearched = {1, 4, 8, 35, 97, 85, 36, 54, 77, 42};
		int[] numbersToBeSearchedInTheArray = {0, 25, 89, 8, 40, 90, 72, 77};
		LinearSearch linearSearch = new LinearSearch();
		for(int i = 0; i < numbersToBeSearchedInTheArray.length; i++) {
			int indexOfTheElementToSearch = linearSearch.linearSearch(arrayToBeSearched, numbersToBeSearchedInTheArray[i]);
			if(indexOfTheElementToSearch >= 0) {
				System.out.println("Number " + numbersToBeSearchedInTheArray[i] + " found at index " + indexOfTheElementToSearch);
			} else {
				System.out.println("Element " + numbersToBeSearchedInTheArray[i] + " not found!");
			}
		}
	}
	
	/**
	 * Binary Search block
	 */
	protected static void doBinarySearchRecursive() {
		int[] sortedArray = {1, 9, 45, 56, 89, 123, 456, 987};
		int[] numbersToBeSearchedInTheArray = {1, 987, 0, 777, 45, 89, 123, -25};
		BinarySearch binarySearch = new BinarySearch();
		for(int i = 0; i < numbersToBeSearchedInTheArray.length; i++) {
			int indexOfTheElementToSearch = binarySearch.binarySearchRecursive(sortedArray, 0, sortedArray.length-1, numbersToBeSearchedInTheArray[i]);
			if(indexOfTheElementToSearch >= 0) {
				System.out.println("Number " + numbersToBeSearchedInTheArray[i] + " found at index " + indexOfTheElementToSearch);
			} else {
				System.out.println("Element " + numbersToBeSearchedInTheArray[i] + " not found!");
			}
		}
	}
	
	protected static void doBinarySearchIterative() {
		int[] sortedArray = {1, 9, 45, 56, 89, 123, 456, 987};
		int[] numbersToBeSearchedInTheArray = {1, 987, 0, 777, 45, 89, 123, -25};
		BinarySearch binarySearch = new BinarySearch();
		for(int i = 0; i < numbersToBeSearchedInTheArray.length; i++) {
			int indexOfTheElementToSearch = binarySearch.binarySearchIterative(sortedArray, 0, sortedArray.length-1, numbersToBeSearchedInTheArray[i]);
			if(indexOfTheElementToSearch >= 0) {
				System.out.println("Number " + numbersToBeSearchedInTheArray[i] + " found at index " + indexOfTheElementToSearch);
			} else {
				System.out.println("Element " + numbersToBeSearchedInTheArray[i] + " not found!");
			}
		}
	}
	
	protected static void doSelectionSort() {
		int[] arrayToBeSorted1 = {91, 90, 89, 76, 64, 53, 48, 37, 28, 19, 1};
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort(arrayToBeSorted1);
		
		int[] arrayToBeSorted2 = {-43, -69, 0, -347, 800, 93, 1, -4};
		selectionSort.selectionSort(arrayToBeSorted2);
	}
}
