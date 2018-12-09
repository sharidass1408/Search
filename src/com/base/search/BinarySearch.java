package com.base.search;

public class BinarySearch {

	public static void main(String[] args) {
		  int a[] = { 1,2,3};
		  int target = 3; 
		  int indexTarget = findElement(0, a.length-1, target, a);

		 if(indexTarget>=0)
		  System.out.println(indexTarget);
		 else
		  System.out.println("Not found");


	}

	private static int findElement(int left, int right, int target, int[] a) {
		 if(left>right)
			  return -1;
 			
		 int middle = (left + right)/2;
	
		 if( a[middle] == target) {
			 return middle;
		 }
		 else if( a[middle] > target){  // left side search
           
			return findElement(left, middle-1, target, a);
		
		 }else {//if (a[middle] < target){ // right side search
			    
			 return findElement(middle+1, right, target, a);
		 
		 } 
	
	}
}