package array;

public class Array {

	
		public static void main(String[] args) {
			int a[];
			a=new int[3];
			a[0]=1;
			           //a[1] is not present but as array a[] is int so a[1] will get default value 0
			a[2]=3;
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}

	}

}
