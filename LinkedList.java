
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
  //insert node at last.
    public void insert()
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
    
   
    //print nodes.
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
      //reverse linked list function
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
   //i create cycle in linked list,
   //then i create detect cycle(),
   
   void createcycle()
   {
       Node curr;
       curr=head;
       while(curr.next!=null)
       {
         curr=curr.next;  
       }
       // last node point to 2nd node .
       curr.next=head.next;
   }
   // to detect linked list i used floyd algorithm
   void detectcycle()
  {
      Node fast=head,slow=head;
      while(fast!=null&&fast.next!=null)
      {
          fast=fast.next.next;
          slow=slow.next;
          if(slow==fast)
          {
              System.out.println("cycle found");
              break;
          }
          if(fast.next==null)
          {
              System.out.println("cycle not found");
          }
      }
      

   }
   
 
   //find starting node of loop
   void startnode()
   {
        Node fast=head,slow=head;
      while(fast!=null&&fast.next!=null)
      {
          fast=fast.next.next;
          slow=slow.next;
          if(slow==fast)
          {
              break;
          }
      }
          slow=head;
          while(fast!=slow)
          {
              fast=fast.next;
              slow=slow.next;
          }
          System.out.println(fast.data);
       
   }
   //break loop
   void breakLoop()
   {
        Node fast=head,slow=head,ptr;
      while(fast!=null&&fast.next!=null)
      {
          fast=fast.next.next;
          slow=slow.next;
          
          if(slow==fast)
          {
              break;
          }
      }
      
          fast.next=null;
       
   }
 }

    
    
    
    


public class LinkedList
{
public static void main(String[] args) 
    {
        int choice=0;
        LinkedList1 list =new LinkedList1();
        
        while(choice!=10)
        {
        System.out.println("""
                           enter 1 for add data 
                            enter 2 for display 
                            enter 3 for reverse
                           enter 4 for loop
                           enter 5 for detect loop
                           enter 7 for break loop
                           """);
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
            case 4 ->       
            {
             list.createcycle();
             
               break;
            }
             case 5 ->       
            {
             list.detectcycle();
             
               break;
            }
            case 6 ->       
            {
             list.startnode();
             
               break;
            }
            case 7 ->       
            {
             list.breakLoop();
             
               break;
            }
        }
        }
        
        
    }
    
}
