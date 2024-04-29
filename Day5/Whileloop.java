package Day5;

public class Whileloop {

	public static void main(String[] args) {

        //ex1 print 1 to 10 numbers
		
		/*int i=1; 
		while(i<=10)  //condition  1  2
		{
			System.out.println(i); //1  2
			i++;    //incrementation //2 3
		}*/
		
		//ex2 printing hello message 10 times
		
		/*int i=1;
		while(i<=10)
		{
			System.out.println("hello");
			i++;
		}*/
		
		//ex3 print even numbers between 1 to 10
		//approach 1
		/*int i=2;
		while(i<=10)
		{
			System.out.println(i);
			//i=i+2;
			i+=2;
		}*/
		
		//approach 2
		/*int i=1;
		while(i<=10)
		{
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}*/
		
		//ex4 print odd numbers between 1 to 10
		/*int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}*/
		
		//ex5 10..........1
		int i=10;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
			

	}

}
