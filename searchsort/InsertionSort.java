/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchsort;

import java.util.Arrays;

/**
 *
 * @author Aryan
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={8,12,9,13,7};
        System.out.println(Arrays.toString(arr));
        solve(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }
    static void solve(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
           int temp=arr[i];
            int j=i-1;
            while(j>=0 && temp<=arr[j])
                    {
                      
                
               
                   
                   arr[j+1]=arr[j];
                   
                     j--;
                System.out.println(Arrays.toString(arr));
            
            }
            arr[j+1]=temp;
            
            
        }
    }
    
}
