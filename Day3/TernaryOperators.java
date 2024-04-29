package Day3;

public class TernaryOperators {

	public static void main(String[] args) {
		
		//ternary/conditional ?:
		//var=exp ? result1 : result2
		
		int a=200, b=100;
		int x=a>b ? a : b; //if the expression is true result 1 will be printed
		                   //if the expression is false result 2 will be printed
		
		System.out.println(x);  //200

		
		//example 
		x=(1==1)?100:200;
		System.out.println(x);
				
	}

}
