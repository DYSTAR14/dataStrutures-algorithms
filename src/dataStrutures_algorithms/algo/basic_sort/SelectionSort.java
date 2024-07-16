package dataStrutures_algorithms.algo.basic_sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < array.length; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if(i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] array = {4,2,6,5,1,3};
		sort(array);
		System.out.println(Arrays.toString(array));	 
	}

}
