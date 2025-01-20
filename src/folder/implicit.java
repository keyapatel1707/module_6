

public class implicit {

	public static void main(String[] args) 
	{
		int a=10;
		long l;
		
		l=a;
		System.out.println("implicit "+l);
		
		int b=(int)l;
		System.out.println("explicit "+b);
		
		int x=128;
		byte bb;
		
		bb=(byte)x;
		System.out.println("byte "+bb);
		

	}

}
