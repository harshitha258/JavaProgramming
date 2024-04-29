package Day4;

public class LargestOf3Numbers {

	public static void main(String[] args) {
	  /*
	   * a>b and a>c a is largest
	   * b>a and b>c b is largest
	   * c>a and c>b c is largest
	   */
		int a=300,b=2000,c=500;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest");
		}
		else 
		{
			System.out.println("c is largest");
		}
	}

}
