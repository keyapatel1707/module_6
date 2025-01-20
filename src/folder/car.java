
	class Car {
	    String brand;
	    String model;
	    int year;

	  
	    public Car() {
	        this.brand = "unknown";
	        this.model = "unknown";
	        this.year = 0;
	    }

	   
	    public Car(String brand) {
	        this.brand = brand;
	        this.model = "unknown";
	        this.year = 0;
	    }

	   
	    public Car(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	        this.year = 0;
	    }

	    
	    public Car(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    
	    public void displayDetails() {
	        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
	    }
	public class ConstructorOverloading {
	    public static void main(String[] args) {
	        
	        Car car1 = new Car();
	        car1.displayDetails();

	        
	        Car car2 = new Car("Toyota");
	        car2.displayDetails();

	       
	        Car car3 = new Car("Honda", "Civic");
	        car3.displayDetails();

	        
	        Car car4 = new Car("Ford", "Mustang", 2023);
	        car4.displayDetails();
	    }
	}
	}

	

	