package Day7;

public class Stringcomparisions {

	public static void main(String[] args) {
		
		//case 1
		String s1="harshitha";
		String s2="harshitha";
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		//case 2
		String a1=new String("harshitha");
		String a2=new String("harshitha");
		System.out.println(a1==a2);    //false = compares objects a1 and a2 are 2 different objects 
				
		System.out.println(a1.equals(a2)); //true = compares value of objects 
	
		
		//case 3
		String s3="abc";
		String s4=new String("abc");
		String s5=s4;
		
		System.out.println(s3); //abc
		System.out.println(s4); //abc
		System.out.println(s5); //abc
		
		System.out.println(s3==s4); //false
		System.out.println(s3.equals(s4)); //true
		 
		System.out.println(s4==s5);  //true
		System.out.println(s4.equals(s5)); //true
		
	}

}
