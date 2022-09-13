
package com.mycompany.searchsort;

import java.util.Arrays;

/**
 *
 * @author Aryan
 */
public class SelectionSort 
{
    public static void main(String[] args) {
        int[] arr={18,3,4,1,5};
        int n=arr.length;
         System.out.println(Arrays.toString(arr));
         //Arraysort(arr,n);
         selection( arr, n);
         
         
    }
    
  
   
    static void selection(int arr[], int n)  
{  
    int i, j, small;  
      
    for (i = 0; i < n-1; i++)    // One by one move boundary of unsorted subarray  
    {  
        small = i; //minimum element in unsorted array  
          
        for (j = i+1; j < n; j++)  
        if (arr[j] < arr[small])  
            small = j;  
         System.out.println(Arrays.toString(arr));
// Swap the minimum element with the first element  
    int temp = arr[small];  
    arr[small] = arr[i];  
    arr[i] = temp;  
     System.out.println(Arrays.toString(arr));
    }  
}  
   
}

