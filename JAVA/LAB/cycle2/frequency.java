// to find the frequency of a string.
//krishnapriya v r
//rollno 37
import java.util.*;
class frequency
{
  public static void main (String args[])
  {
    int fre=0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the string :");
    String str;
    str=s.nextLine();
    str=str.toLowerCase();
    System.out.println("enter the string character");
    char c=s.next().charAt(0);
    int len=str.length();
    for(int i=0;i<len;i++)
    {
       if(str.charAt(i)==c)
       {
          fre++;
        }
    }
    System.out.println("The frequency of character is"+fre);
    s.close();
   }
}
