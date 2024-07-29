import java.util.*;
class sub
{
	public static void main (String args[])
	{
		Scanner s1 = new Scanner(System.in);
		int a[][] = new int [50][50];
		int b[][] = new int [50][50];
		int add[][] = new int [50][50];

		int i,j,r,c;
		System.out.println("enter the no of rows and coloums");
		r = s1.nextInt();
		c = s1.nextInt();

		System.out.println("enter the elements of matrix a");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j] = s1.nextInt();
			}
		}
		System.out.println("enter the elements of matrix b");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j] = s1.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			
			for(j=0;j<c;j++)
			{
				add[i][j] = a[i][j]-b[i][j];
				System.out.print(add[i][j]+"\t");
				
			}
			System.out.println();
		}
		s1.close();
	}
}
