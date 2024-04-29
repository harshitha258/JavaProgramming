package Day3;

public class IncrementOperator {

	public static void main(String[] args) {
		
		 //++  Increment operator -->pre,post
		
		int a=10;
		
		//scenario 1 - no difference
		//a++;   //a=a+1  //post increment
		//++a;              //pre increment
		//System.out.println(a); //11
		
		//scenario 2
		
		//int result = a++;  //10
		int result =++a;     //11
		System.out.println(result);
		
		
		
		
		

	}

}
