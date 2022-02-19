package Collection;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a =new int[3];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("=====================");
		
		for(int i:a)
		{
			System.out.println(i);
		}

		System.out.println("=====================");
		
		int[][] ar =new int[2][2];
		
		ar[0][0]=10;
		ar[0][1]=20;
		ar[1][0]=30;
		ar[1][1]=40;
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
			System.out.println(ar[i][j]);
			}
		}
		
	}

}
