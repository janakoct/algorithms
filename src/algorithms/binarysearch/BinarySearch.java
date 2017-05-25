package algorithms.binarysearch;

public class BinarySearch {

	public int binarySearchRecursive(int[] sortedArray, int leftIndex, int rightIndex, int numberToBeSearched) {
		if (rightIndex >= leftIndex) {
			int middleIndex = leftIndex + ((rightIndex - leftIndex) / 2);
			if (sortedArray[middleIndex] == numberToBeSearched) {
				return middleIndex;
			} else if (sortedArray[middleIndex] > numberToBeSearched) {
				rightIndex = middleIndex - 1;
				return binarySearchRecursive(sortedArray, leftIndex, rightIndex, numberToBeSearched);
			} else {
				leftIndex = middleIndex + 1;
				return binarySearchRecursive(sortedArray, leftIndex, rightIndex, numberToBeSearched);
			}
		}
		return -1;
	}

	public int binarySearchIterative(int[] sortedArray, int leftIndex, int rightIndex, int numberToBeSearched) {
		while(rightIndex >= leftIndex) {
			int middleIndex = leftIndex + ((rightIndex - leftIndex)/2);
			if(sortedArray[middleIndex] == numberToBeSearched) {
				return middleIndex;
			} else if(sortedArray[middleIndex] > numberToBeSearched) {
				rightIndex = middleIndex - 1;
			} else {
				leftIndex = middleIndex + 1;
			}
		}
		return -1;
	}
}
