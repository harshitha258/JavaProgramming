package Day7;

public class StringOperations {

	public static void main(String[] args) {
		
	  String s="welcome";
	 // String s=new String("welcome");
	  
	  System.out.println(s);

	  //length of a string
	  System.out.println(s.length());  //7
	  
	  //concat()-joining strings
	  String s1="welcome";
	  String s2="to java";
	  String s3="automation";
	  
	  System.out.println(s1+s2); //welcome to java
	  System.out.println(s1.concat(s2).concat(s3));
	  
	  
	  
	  //trim() - remove spaces 
	  s="  harshi  ";
	  System.out.println(s.length());
	  System.out.println(s.trim().length());
	  
	  //charAt() 
	  s="harshitha";
	  System.out.println(s.charAt(7));
	  
	  //contains() - returns boolean true/false
	  System.out.println(s.contains("shi"));
	 
	  
	  //equals() , equalsIgnoreCase() - compare 2 strings
	  s1="harshitha";
	  s2="HARSHITHA";
	  System.out.println(s1.equals(s2)); //false
	  System.out.println(s1.equalsIgnoreCase(s2)); //true
	  
	  //replace() - replace single or multiple characters in a string
	  s="Good morning harshitha have a nice day";
	  
	  System.out.println(s.replace('a', 'z'));
	  System.out.println(s.replace("harshitha", "harshi"));
	  
	  //substring() -  to extract substring from main string
	  s="welcome";
	  System.out.println(s.substring(3, 6));
	  
	  //split() - divide the string into multiple parts using delimeter
	  //should not use * $ ? . + 
	  s="abc,gmail.com";
	  String a[]=s.split(",");
	  System.out.println(a[0]);
	  System.out.println(a[1]);
	  
	  //toUpperCase() , toLowerCase()
	  s="HarSHITHA";
	  System.out.println(s.toUpperCase());
	  System.out.println(s.toLowerCase());
	  
	}

}
