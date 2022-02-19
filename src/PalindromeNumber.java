import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Value");

		int num=sc.nextInt();

		int org_num=num;

		int rev=0;

		while(num!=0)
		{
			rev=rev*10 + num%10; //0+1234%=4
			num=num/10;//1234/10=123
		}

		if(org_num==rev)
		{
			System.out.println(org_num + " Palindromenumber");
		}
		else
		{
			System.out.println(org_num + " not a Palindromenumber");

		}

	}

}
