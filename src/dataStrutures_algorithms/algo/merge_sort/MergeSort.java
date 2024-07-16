package dataStrutures_algorithms.algo.merge_sort;

import java.util.Arrays;

public class MergeSort {
	
	public static int[] sortArray(int[] array) {
		if(array.length == 1)
			return array;
		int mid = array.length/2;
		int[] arr1 = sortArray(Arrays.copyOfRange(array, 0, mid));
		int[] arr2 = sortArray(Arrays.copyOfRange(array, mid, array.length));
		return mergeSortedArray(arr1, arr2);
	}
	
	public static int[] mergeSortedArray(int[] arry1, int[] arry2) {
		int[] mergeSortedArray = new int[arry1.length + arry2.length];
		int i = 0;
		int j = 0;
		int count = 0;
		while(i < arry1.length && j < arry2.length) {
			if(arry1[i] < arry2[j]) {
				mergeSortedArray[count] = arry1[i];
				i++;
				count++;
			} else {
				mergeSortedArray[count] = arry2[j];
				j++;
				count++;
			}
		}
		while(i < arry1.length) {
			mergeSortedArray[count] = arry1[i];
			i++;
			count++;
		}
		while(j < arry2.length) {
			mergeSortedArray[count] = arry2[j];
			j++;
			count++;
		}
		return mergeSortedArray;
	}

	public static void main(String[] args) {
		System.out.println("Sorted array");
		int[] arr1 = {1,3,5,7,9};
		System.out.print("Arr1 : ");
		Arrays.stream(arr1).forEach(System.out::print);
		System.out.println();
		int[] arr2 = {2,4,6,8};
		System.out.print("Arr1 : ");
		Arrays.stream(arr2).forEach(System.out::print);
		System.out.println();
		int[] sortedArry = mergeSortedArray(arr1, arr2);
		System.out.print("Sort : ");
		Arrays.stream(sortedArry)
			.forEach(System.out::print);
		System.out.println();
		
		int[] arr3 = {3,1,4,2};
		System.out.print("unsorted array : ");
		Arrays.stream(arr3).forEach(System.out::print);
		System.out.println();
		System.out.print("Sort : ");
		Arrays.stream(sortArray(arr3))
			.forEach(System.out::print);
		
	}

}
