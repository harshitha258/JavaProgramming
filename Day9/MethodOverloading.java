package Day9;

public class MethodOverloading //creating multiple methods with the same name
{
	int x,y,z;
	double d;
	
	void sum()         //1//method names should be same
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
     
	void sum(int a, int b)  //2//no of parameters should be different
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a, double b)  //3//data type should be different
	{
		x=a;
		d=b;
		System.out.println(x+d);  
	}
	
	void sum(double b, int a)    //4//order of parameters should be different
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
        
		mo.sum();   //1
		
		mo.sum(100,200);  //2
		
		mo.sum(100,10.5);   //3
		
		mo.sum(20.5,100);   //4
	}

}
