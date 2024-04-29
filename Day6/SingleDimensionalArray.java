package Day6;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		/* declare an array
		 * insert values into array
		 * find size of an array
		 * read single value from an array
		 * read multiple values from an array
		 */

		 //declaration
		//approach 1
		
		/*int a[]=new int[3];
		
		a[0]=100;
		a[1]=200;
		a[3]=300;*/
		
		//approach 2
		int a[]= {100,200,300,400,500};
		
		//size/length of the array
		System.out.println(a.length);
		
		//get single value
		System.out.println(a[2]); 
		
		//get all values
		System.out.println(Arrays.toString(a));
		
		//get all the values through loop
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//enhanced for loop
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
