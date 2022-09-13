/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursionjava;

import java.util.Scanner;

/**
 *
 * @author Aryan
 */
public class SayDigit 
{
    public static void main(String[] args) {
         int n;
         String[] arr = new String[]{"zero","one","two","three","four","five" ,"six","seven" ,"eight","nine"};
          Scanner sc=new Scanner(System.in);
          System.out.println("enter number");
          n=sc.nextInt();
          digitconverToWord dd=new digitconverToWord();
          dd.convert(n, arr);
        
      
        
        
    }
}
    class digitconverToWord
    {
 void convert(int n,String arr[])
    {
        if(n==0)
        {
            return;
        }
        int digit=n%10;
        n=n/10;
        convert(n,arr);
        System.out.print(arr[digit]+" ");        
        
        
        
    }
    }

