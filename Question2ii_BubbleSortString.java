import java.util.Scanner;

public class Question2ii_BubbleSortString
{	
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		String entered;
		char temp;
		System.out.println("Enter a word to be sorted alphabetically:");
		entered=input.nextLine();
		char charcaterArray[]=entered.toCharArray();
		
		for(int i=0;i<charcaterArray.length-1;i++)
		{
			for(int j=0;j<(charcaterArray.length-1-i);j++)
			{
				if(charcaterArray[j]>charcaterArray[j+1])
				{
					temp=charcaterArray[j];
					charcaterArray[j]=charcaterArray[j+1];
					charcaterArray[j+1]=temp;
				}
			}
		}
		
		
		System.out.println("\nWord soted using bubble sort is: " );
		
		for(int i=0;i<charcaterArray.length;i++)
		{
			System.out.print(charcaterArray[i]);
		}
		
	
	}
	

}
