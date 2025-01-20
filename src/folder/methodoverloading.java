
public class methodoverloading {
	public int add(int a,int b)
	{
		return a+b;
		
	}
	public double add(double a, double b)
	{
		return a+b;
	}
	
	public String add(String a,String b)
	{
		return a+b;
		
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {;
		System.out.println("Sum of three integers: " + obj.add(1, 2, 3));  

	}

}
