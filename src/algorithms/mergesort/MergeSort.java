package algorithms.mergesort;

public class MergeSort {

	public void mergeSort(int[] arrayToBeSorted, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int middleIndex = (startIndex + endIndex) / 2;
			mergeSort(arrayToBeSorted, startIndex, middleIndex);
			mergeSort(arrayToBeSorted, middleIndex + 1, endIndex);

			merge(arrayToBeSorted, startIndex, middleIndex, endIndex);
		}
	}

	private void merge(int[] arrayToBeSorted, int startIndex, int middleIndex, int endIndex) {
		// create temporary arrays
		int temp1Size = middleIndex - startIndex + 1;
		int temp2Size = endIndex - middleIndex;
		int[] temp1 = new int[temp1Size];
		int[] temp2 = new int[temp2Size];
		for (int i = 0; i < temp1Size; i++) {
			temp1[i] = arrayToBeSorted[startIndex + i];
		}
		for (int i = 0; i < temp2Size; i++) {
			temp2[i] = arrayToBeSorted[middleIndex + 1 + i];
		}

		int i = 0, j = 0;
		int k = startIndex;
		while ((i < temp1Size) && (j < temp2Size)) {
			if(temp1[i] <= temp2[j]){
				arrayToBeSorted[k] = temp1[i];
				i++;
			} else {
				arrayToBeSorted[k] = temp2[j];
				j++;
			}
			k++;
		}
		
		while (i < temp1Size) {
			arrayToBeSorted[k] = temp1[i];
			i++;
			k++;
		}
		
		while (j < temp2Size) {
			arrayToBeSorted[k] = temp2[j];
			j++;
			k++;
		}
	}
}
