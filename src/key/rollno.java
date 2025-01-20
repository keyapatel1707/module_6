package key;

public class rollno
{
	int rno;
	string name;
	public void setdata(int rno, string name) 
	{
		this.rno =rno;
		this.name=name;
	}
	public void show()
	{
		System.out.println("rno is"+rno);
		System.out.println("name is"+name);
		
	}


	public static void main(String[] args)
	{
		rollno r1=new rollno();
		r1.setdata(17,"keya");
		r1.show();
		
		

	}
	private void setdata(int rno2, String string) {
		// TODO Auto-generated method stub
		
	}

}
