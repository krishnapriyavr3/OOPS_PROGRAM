// program to check whether the input string is palindrome or not.
//krishnapriya v r
//rollno 37
import java.util.*;
class palindrome
{
  public static void main (String args[])
  {
     String st,reverse="";
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter the string:");
     st=s1.nextLine();
     st=st.toLowerCase();
     int length=st.length();
     for(int i=length-1;i>=0;i--)
     {
     reverse =reverse+st.charAt(i);
     }
     if(reverse.equals(st))
     {
     System.out.println("The string is palindrome "+st);
     }
     else
     {
     System.out.println("the string is not palindrome "+st);
     }
     s1.close();
   }
}

