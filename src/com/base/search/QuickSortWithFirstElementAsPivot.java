package com.base.search;

import java.util.Arrays;

public class QuickSortWithFirstElementAsPivot {

	public static void main(String[] args) {

		int[] array = {8,2,7,3,4,1};
		System.out.println("Before sorting: ");		
		printArray(array);
		
		int left = 0;
		int right = array.length;

		quickSort(array, left, right);

		System.out.println("After Sorting: ");		
		printArray(array);
	}

	private static void quickSort(int[] array, int left, int right ) {
		
		int newPivotIndex = partition(array, left);
		
		if(left < newPivotIndex ) {
			int[] subArray = subArray(array, left, newPivotIndex-1);
			quickSort(subArray, left, newPivotIndex-1);
		}
		
		if(newPivotIndex < right) {
			int[] subArray = subArray(array, newPivotIndex, right);
			quickSort(subArray, newPivotIndex, right);
		}
		
		
	}

	private static int[] subArray(int[] array, int from, int to) {
		return Arrays.copyOfRange(array, from, to);
	}
	
	private static int partition(int[] array, int pivotIndex) {

		//Assume Oth location as pivot location
		int pivot = array[pivotIndex];
		
		
		//Partition all the elements except the pivot at location zero
		int i = pivotIndex+1;
		int j = pivotIndex+1;
		
		for( ; j < array.length; j++) {
			
			if(array[j] < pivot) {
				
				if(i != j) // if i and j are equal then swap has no meaning
					swap(i,j,array);
				
				i++; // we need to increment i even if it is same as j
			} 
			
		}
		
		//Place back the pivot at zeroth location to i-1 location
		
		int temp = array[i-1];
		array[i-1] = pivot;		
		array[0] = temp;
		
		return i-1; //new location of the pivot
		
	}

	private static void swap(int left, int right, int[] array) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	private static void printArray(int[] array) {
		
		for(int element: array) {
			System.out.println(element);
		}
		
	}

}
