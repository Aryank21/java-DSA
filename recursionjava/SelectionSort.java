/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursionjava;

import java.util.Arrays;

/**
 *
 * @author Aryan
 */
public class SelectionSort {
    public static void main(String[] args)
    {
        int []arr={12,29,25,8,32,17,40};
        int n=arr.length-1;
        int i=0;
        System.out.println(Arrays.toString(arr));
        solve(arr,n,i);
        System.out.println(Arrays.toString(arr));
    }
    
    static void solve(int arr[],int n,int i)
    {
      
              
        int small,j;
        //base case
        if(i==n)
        {
            
            return;
        }
        
           for(j=i+1;j<n;j++)
            {
               
                small=i;
            if(arr[small]>arr[j])
            {
                small=j;
               
            }
           
                int temp=arr[small];
                arr[small]=arr[i];
                arr[i]=temp;
               
                
               
            }
      
         solve(arr,n,i+1);
       
        
    }
    
}
