import java.io.FileWriter;
import java.io.IOException;
class CreateFile
{
	public static void main(String args[])
   	{
		String str = "File Handling in java using"+"FileWriter"; 
		FileWriter fw=new FileWriter("output.txt");
		for (int i = 0; i < str.length(); i++) 
			fw.write(str.charAt(i)); 

		System.out.println("Writing successful");
		fw.close(); 
	} 
}

