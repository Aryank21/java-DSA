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
public class Power {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter a");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
                System.out.println("enter b");
                b=sc.nextInt();
              int ans=  resultpower(a,b);
              System.out.println(ans);

        
    }
    static int  resultpower(int a,int b)
    {
       
        //base case
        
        if(b==0)
        {
            return 1;
        }
        if(b==1)
        {
            return a;
        }
        int ans=resultpower(a,b/2);
        if(b%2==0)
        {
            return ans *ans;
        }
        else
        {
            return a*ans*ans;
        }
       
    }
    
}
