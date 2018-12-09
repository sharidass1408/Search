package com.binarysearch.problems;

/*
 *  Algorithm question: Given a sorted array find the magic number.
 *  Anumber is said to be magic if the number is equal to its index in array. 
 *  Eg.  -1,1,3,5,7,8 in this array 1 is magic number since it is equal to its base index
 */

public class MagicNumber {

	public static void main(String[] args) {
		  int a[] = { -1,0,1,2,2,3,3,4,4,4};
		 
		  int indexTarget = findMagicNumber(0, a.length-1, a);

		 if(indexTarget>=0)
		  System.out.println(indexTarget);
		 else
		  System.out.println("No Magic Number Found");


	}

	private static int findMagicNumber(int left, int right, int[] a) {
		 if(left>right)
			  return -1;
			
		 int middle = (left + right)/2;
	
		 if( a[middle] == middle) {
			 return middle;
		 }
		 else if( a[middle] > middle){  // Search right as no hope of finding magic number in left portion
         
			return findMagicNumber(middle+1, right,a);
		
		 }else { // Search left side as no hope of finding magic number in right protion
			    
			 return findMagicNumber(left, middle-1, a);
		 
		 } 
	
	}
}
