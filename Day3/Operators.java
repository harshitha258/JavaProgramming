package Day3;

public class Operators {

	public static void main(String[] args) {
		
		//arithmetic + - * / %
		
		 int a=20, b=10;
		 
		 System.out.println("sum"+(a+b));
		 System.out.println("diff"+(a-b));
		 System.out.println("mul"+(a*b));
		 System.out.println("div"+(a/b));
		 System.out.println("modulo"+(a%b));
		 
		//relational > >= < <= != ==
		//return true/false(boolean)
		 
		 System.out.println(a<b); //false
		 System.out.println(a==b);
		 System.out.println(a<=b);
		 System.out.println(a!=b);
		 
		 
		 //logical && || !
		 //works between 2 or more boolean values
		 //return true or false
		 
		 boolean x=true;
		 boolean y=false;
		 System.out.println(x && y);
		 System.out.println(x || y);
		 System.out.println(!y);
		 
		
		 
	}

}
