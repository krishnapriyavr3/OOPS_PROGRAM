// find the the largest of n numbers without using array.
import java.util.*;
class largest
{
   public static void main (String args[])
   {
     int n,n1,large=0;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the number of elements?");
     n=s.nextInt();
     System.out.println("Enter the elements :");
     for(int i=0;i<n;i++)
     {
        n1=s.nextInt();
        if(n1>large)
        {
           large=n1;
        }
     }
     System.out.println("The largest number is  "+ large);
     s.close();
   }
}

     
     

     

