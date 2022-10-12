
package com.mycompany.searchsort;

import java.util.Arrays;

public class MergeSort 
{
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};

        int beg=0;
        int end=a.length;
       
        solve(beg,end-1,a);
        System.out.println(Arrays.toString(a));
        
    }

    
    static void merge(int a[],int beg,int end,int mid)
    {
       int n1=mid-beg+1;  
       int n2=end-mid;
       //copy element
       int leftarray[]=new int[n1];
        int rightarray[]=new int[n2];

         for(int i=0;i<n1;i++)
          {
              leftarray[i]=a[beg+i];
          }
           for(int i=0;i<n2;i++)
          {
              rightarray[i]=a[mid+1+i];
          }
        int i=0,j=0;
         int k=beg;
          while(i<n1 && j<n2)
          {
               if(leftarray[i]<=rightarray[j])
               {
                        a[k]=leftarray[i];
                        i++;
                           

                }
                else
               {
                     a[k]=rightarray[j];
                          j++;
                    
                 }
                     k++;

           }
            while(i<n1)
         {
           a[k]=leftarray[i];
             i++;
             k++;
            }
            while(j<n2)
         {
            a[k]=rightarray[i];
            j++;
             k++;
            }

    }
    static void solve(int beg,int end,int a[])
    {
       if(beg<end)
        {
        int mid=(beg+end)/2;
       solve(beg,mid,a);//left part
        solve(mid+1,end,a);//right part
        merge(a,beg,end,mid);
         }
    }

    
}
    
