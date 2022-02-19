package StringProgramms;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter You String:");

		String str=sc.next();
		String Org_str=str;
		
		String Rev = "";

		int len=str.length();

		for(int i=len-1;i>=0;i--)
		{
			Rev=Rev+str.charAt(i);
		}


		if(Org_str.equals(Rev))
		{
			System.out.println(str +"string is palindrome");
		}
		else
		{
			System.out.println(str +"string is not palindrome");
		}


	}

}
