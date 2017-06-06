package algorithms.mainpackage;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("********** Linear Search **********");
		UtilityClass.doLinearSearch();
		System.out.println("********** Recursive Binary Search **********");
		UtilityClass.doBinarySearchRecursive();
		System.out.println("********** Iterative Binary Search **********");
		UtilityClass.doBinarySearchIterative();
		System.out.println("********** Selection Sort **********");
		UtilityClass.doSelectionSort();
		System.out.println("********** Bubble Sort **********");
		UtilityClass.doBubbleSort();
	}
}
