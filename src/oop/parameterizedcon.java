package oop;
class person
{
	String name;
	int age;
	person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void displaydetail()
	{
		System.out.println("name"+name);
		System.out.println("age"+age);
		}
}

class parameterizedcon {
	public static void main(String[] args) {
		person person = new person("keya",17);
		person.displaydetail();

	}

}

