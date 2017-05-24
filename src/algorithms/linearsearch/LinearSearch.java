package algorithms.linearsearch;

public class LinearSearch {

	public int linearSearch(int[] arrayToBeSearched, int elementToSearch) {
		for(int i = 0; i < arrayToBeSearched.length; i++) {
			if(arrayToBeSearched[i] == elementToSearch) {
				return i;
			}
		}
		return -1;
	}
}
