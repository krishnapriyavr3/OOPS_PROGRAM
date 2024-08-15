// to find the reverse of a string
//krishnapriya v r
//rollno 37
import java.util.*;
class reverse
{
  public static void main(String args[])
  {
    String st,reverse="";
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the string: ");
    st=s.nextLine();
    st=st.toLowerCase();
    int length=st.length();
    for(int i=length-1;i>=0;i--)
    {
      reverse=reverse+st.charAt(i);
    }
    System.out.println("The reversed string is "+ reverse);
   }
}
