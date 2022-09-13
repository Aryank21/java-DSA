package com.mycompany.recursionjava;


import java.util.Arrays;








/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aryan
 */
public class BubbleSort
{
    public static void main(String[] args) {
        int []arr={5,3,7,8,2};
        int n=arr.length-1;
        System.out.println("orignal array");
       System.out.println(Arrays.toString(arr));
          sortBubble(arr,n);
         System.out.println("Array sort");
          System.out.println(Arrays.toString(arr));
     
     
        
    
    
}

    static void sortBubble(int []arr,int n)
    {
       
       //base case
       if(n==0)
       {
         //  System.out.println("Reach base");
           return;
       }
        System.out.println("sorting in progress");
       for(int i=0;i<n;i++)
       {
           if(arr[i+1]<arr[i])
            {
                int a=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=a;
            }
           System.out.println(Arrays.toString(arr));
       }
       //recursive call
        sortBubble(arr,n-1);
            
                
            }  
          
}
        
    
    



