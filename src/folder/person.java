class person {
   String name;
   int age;
   String city;
   
   person()
   {
	   name="unknown";
	   age=0;
	   city="unknown";
   }
   person(String name,int age)
   {
	   this.name=name;
	   this.age=age;
	   this.city=city;   
   }
   person(String name,int age,String city)
   {
	   this.name=name;
	   this.age=age;
	   this.city=city;
   }
   void display()
   {
	   System.out.println("name"+name);
	   System.out.println("Age: " + age);
       System.out.println("City: " + city);
   }
	public static void main(String[] args) {
	    person person1=new person();
	    System.out.println("person 1 detail");
	    person1.display();
	    
	    person person2=new person("keya",20);
	    System.out.println("\n person 2 detail");
	    person2.display();
	    
	    person person3=new person("kita",10,"bombay");
	    System.out.println("\n person 3 detail");
	    person3.display();

	}

}
