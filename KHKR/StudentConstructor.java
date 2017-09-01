public class StudentConstructor
{
	public static void main(String[] args) {

		Student s1 = new Student("Mahi","1232dkjl","Something");
		Student s2 = new Student("Ram","789CD","EEE");

		System.out.println(s2.course+" The name of the student is: "+s1.name+" "+s1.rollNumber);
		
	}
}

class Student
{
	//int ,float ,double, boolean,long,char
	String name = new String();
	String rollNumber = new String();
	String course = new String();

	Student(String a,String b,String c)
	{
		name = a;
		rollNumber = b;
		course = c;
	}
		
		
}