package StringProgramms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1) Using + (string concatenation) Operator

		String str = "ABCD";
		String Rev ="";

		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			Rev = Rev+str.charAt(i);
		}

		System.out.println("Resvese String is="+Rev);
	}

/*

		//2)Using character Array

		char a[]=str.toCharArray();
		int len =a.length;

		for(int i=len-1;i>=0;i--)
		{
			Rev=Rev+a[i];
		}
		System.out.println("Resvese String is="+Rev);


	}
		 
		
		
		//2)Using String Buffer Class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		*/
	
	}