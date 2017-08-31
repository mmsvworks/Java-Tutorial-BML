
public class MultipleClasses
{
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car(); 

		car1.name = "Tesla";
		car2.name = "Jag";
		car3.name = "Ford"; 

		car1.brake();
		car2.brake();
		car3.brake();

	}
}

class Car
{
	String name = new String();
	void brake()
	{
		System.out.println(name+" Car is stopped");
	}

	void acceleration()
	{
		System.out.println(name+" Car is acceleration");
	}

}

