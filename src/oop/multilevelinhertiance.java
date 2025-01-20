package oop;
class person
{
	void displaydetail()
	{
		System.out.println("my man");
	}
}
   class student extends person
   {
	   void study() {
		   System.out.println("studying");
   }
   }
   
    class graduatestudent extends student
    {
    	void research()
    	{
    		System.out.println("the graduate");
    }
    }
    
	public class multilevelinhertiance 
	{
	public static void main(String[] args) {
		graduatestudent gradstudent = new graduatestudent();
		gradstudent.displaydetail();
		gradstudent.study();
		gradstudent.research();
		
		
	}

}
