
package com.mycompany.recursionjava;

/**
 *
 * @author Aryan
 */
//binary search using recursion
public class BinarySearch
{
    public static void main(String[] args)
    {
        int key=-1,last=4,start=0;
        int arr[]=new int[]{2,4,6,10,16};
        
        solve ss=new solve();
     
     //  ss.print(arr, start, last);
         ss.Bsearch(arr, start, last, key);
        
        
    }
    
}
class solve
{
    void Bsearch(int arr[],int start,int last,int key)
    {
       
         
        //base case
        if(start>last)
        {
            System.out.println("not found");
            return ; //not found any key value;
        }
        
        
        // print array every time to see binary search perform
        for(int i=start;i<=last;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
         
         System.out.println("");
         
        int mid=(start+last)/2;//mid value of array
        
        if(arr[mid]==key)
        {
            System.out.println("found");
            //found
        }
        
        if(arr[mid]<key)
        {
            
                     Bsearch(arr,mid+1,last,key);
        }
        else
        {
            
                     Bsearch(arr,start,mid-1,key);
        }
        
    
    }
    
    
}
