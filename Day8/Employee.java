package Day8;

public class Employee 
{
	int eid;
	String name;	
	String job;
	int sal;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.name="john";
		emp1.job="tester";
		emp1.sal=50000;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.name="david";
		emp2.job="tester";
		emp2.sal=55000;
		
		emp2.display();
		
	}

}
