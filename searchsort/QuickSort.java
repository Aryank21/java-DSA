/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchsort;



/**
 *
 * @author Aryan
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={1,0,4,3,5};
        int l=arr.length;
        int s=0;
       
        solve(arr,s,l);
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]);
            
        }
        
    }
    static void solve(int arr[],int s,int l)
    {
        
        
        if(s<l)
        {
          int p= part(arr, s, l);

       
        //right part
        solve(arr,s,p-1);
       
        //left part
         solve(arr,p+1,l);
      }
        
        
        
       
        
    }
    static int part(int arr[],int s,int l)
    {
        
        int piviot=arr[s];
        int count=0;
        for(int i=s;i<l;i++)
        {
            if( arr[i]<=piviot)
            {
                count ++;
                
            }
            
        }
        
        int piviotIndex=s+count;
     
        //swap piviot value on its actual postion
        
        
        arr[s]=arr[piviotIndex];
        arr[piviotIndex]=piviot;
        
        
        
        int i=s,j=l;
        while(i<=j)
        {
            while(arr[i]<piviot)
            {
                i++;
            }
            while(arr[j]>piviot)
            {
                j--;
            }
            if(i<=j)
            {
                int a=arr[i];
                arr[i]=arr[j];
                arr[j]=a;
                i++;
                j--;
                
            }
            
        }
        
       
        return piviotIndex;
        
    }
    
   
}
