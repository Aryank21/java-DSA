/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchsort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aryan
 */
public class BubbleSort 
{
    static int n;
    public static void main(String[] args) 
    {
        System.out.println("enter array size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array element of size"+n);
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
        System.out.println(Arrays.toString(arr));
        sortArray(arr);
        // System.out.println(Arrays.toString(arr));
       
       
        
    }
    
    static void sortArray(int[]arr)
    {
       
        
        for( int i=0;i<n;i++)
        {
          
           for(int j=i+1;j<n;j++)
        {
           if(arr[j]<arr[i])
            {
                int a=arr[i];
                arr[i]=arr[j];
                arr[j]=a;
            }  
            System.out.println(Arrays.toString(arr));
        }
           
       
           
        }
        
        
        
    }
}
