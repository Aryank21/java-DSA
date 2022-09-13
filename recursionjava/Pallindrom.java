package com.mycompany.recursionjava;

class Pallindrom   
{   

        static boolean reverseString(String str,int i,int j)   
          { 
              if(i>j)
              {
                  return true;//base case
              }
              if(str.charAt(i)!=str.charAt(j))
              {
                  return false;
              }
              else
              {
                   return reverseString(str,i+1,j-1);
              }
             
              
           
   
}  
         
        /* static boolean checkstring(String string)
             {
                 
                 if(string.length()==0)
                 {
                     return true; 
                 }
                 else
                 {
                     
               return reverseString(string,0,string.length()-1);
                 }
                 
             }*/
      public static void main(String[] args)   
    {      
 
        String str = "aba"; 
        boolean checkstring=reverseString(str,0,str.length()-1);
        if(checkstring)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        
        
                 
             }
}  