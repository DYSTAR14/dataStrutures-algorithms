package dataStrutures_algorithms.algo.quick_sort;

import java.util.Arrays;

public class QuickSort {
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static int pivot(int[] array, int pivotIndex, int endIndex) {
		int swapIndex = pivotIndex;
		for(int i = pivotIndex + 1; i <= endIndex; i++ ) {
			if (array[i] < array[pivotIndex]) {
				swapIndex++;
				swap(array, swapIndex, i);
			}
		}
		swap(array, pivotIndex, swapIndex);
		return swapIndex;
	}
	
	public static void sortHelper(int[] array, int left, int right) {
		if(left < right) {
			int pivotIndex = pivot(array, left, right);
			sortHelper(array, left, pivotIndex - 1);
			sortHelper(array, pivotIndex + 1, right);
		}
	}
	
	public static void quickSort(int[] array) {
		sortHelper(array, 0, array.length-1);
	}

	public static void main(String[] args) {
		
		int[] array = {4,6,1,7,3,2,5};
		System.out.println(array.length);
		int returnedIndex = pivot(array, 0, 6);
		System.out.println("Returned Index " + returnedIndex );
		System.out.println(Arrays.toString(array));
		quickSort(array);
		System.out.println(Arrays.toString(array));
	}

}
