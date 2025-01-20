
public class constructor {

	public static void main(String[] args) {
		class Student {
		    private String name;
		    private int age;
		    private String course;

		    public Student() {
		        this.name = "Unknown";
		        this.age = 0;
		        this.course = "Not enrolled";
		    }

		    public Student(String name) {
		        this.name = name;
		        this.age = 0;
		        this.course = "Not enrolled";
		    }

		  
		    public Student(String name, int age) {
		        this.name = name;
		        this.age = age;
		        this.course = "Not enrolled";
		    }

		    public Student(String name, int age, String course) {
		        this.name = name;
		        this.age = age;
		        this.course = course;
		    }

		
		    public void displayDetails() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Course: " + course);
		    }

		    public static void main(String[] args) {
		      
		        Student student1 = new Student();
		        Student student2 = new Student("Alice");
		        Student student3 = new Student("Bob", 20);
		        Student student4 = new Student("Charlie", 22, "Computer Science");

		        
		        System.out.println("Student 1 details:");
		        student1.displayDetails();

		        System.out.println("\nStudent 2 details:");
		        student2.displayDetails();

		        System.out.println("\nStudent 3 details:");
		        student3.displayDetails();

		        System.out.println("\nStudent 4 details:");
		        student4.displayDetails();
		    }
		}


	}

}
