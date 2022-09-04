
package com.mycompany.linkedlistquestion;


import java.util.Scanner;

 class LinkedList1 
{
     class Node
{
    int data;
    Node next;
    Node(int items)
    {
        this.data=items;
        this.next=null;
    }
    
}
   
     static Node head,temp;
  
     void insert()
    { 
          System.out.println("enter data");
           Scanner sc=new Scanner(System.in);
           int data=sc.nextInt();
        Node newnode=new Node(data);
       
       
       if(head==null)
       {
           head=newnode;
           temp=newnode;
           newnode.next=null;        
       }
      else
       {
           temp.next=newnode;
          newnode.next=null;
          temp=newnode;
       }
    }
    
   
    
      void printll()
        {
       Node ptr=head;
       if(head==null)
       {
           System.out.println("null head");
       }
       else
       {
       while(ptr.next!=null)
       {
           System.out.print(ptr.data+"->");
           ptr=ptr.next;
       }
          System.out.println(ptr.data+"-> null");
       }
           
        
        
    }
   void reverse()
{
    Node prevsnode,currentnode,nextnode;

    currentnode=head;
    nextnode=head;
       prevsnode=null;
    while(nextnode!=null)
    {
        nextnode=nextnode.next;
        currentnode.next=prevsnode;
        prevsnode=currentnode;
        currentnode=nextnode;
    }
    head=prevsnode;
}
 }
    
    
    
    


public class ReverseLL
{
public static void main(String[] args) 
    {
        int choice=0;
        LinkedList1 list =new LinkedList1();
        
        while(choice!=10)
        {
        System.out.println("enter 1 for add data \n enter 2 for display \n enter 3 for reverse ");
        System.out.println("enter choice");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch(choice)
        {
            case 1 ->  
            {
                
                   list.insert();
               break;
               
            }
            case 2 ->       
            {
               list.printll();
               break;
            }
            case 3 ->       
            {
             list.reverse();
             
               break;
            }
        }
        }
        
        
    }
    
}
