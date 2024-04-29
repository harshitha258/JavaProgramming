package Day3;

public class Decrementoperator {

	public static void main(String[] args) {
		
		 //-- Increment operator -->pre,post
		
		int a=100;
		
		//scenario 1
		
		//a--;  //99
		//--a;    //99
		//System.out.println(a);
		
		//scenario 2
		
		//int res=a--;   //100 99
		int res=--a;     // 99 99
		System.out.println(res);
		System.out.println(a);
		

	}

}
