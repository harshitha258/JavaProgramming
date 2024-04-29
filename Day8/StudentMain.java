package Day8;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu=new Student();
		
		//approach 1
		
		/*stu.sid=105;
		stu.name="scott";
		stu.grade='A';*/
	    
		//approach 2
       // stu.setData(102, "hussain", 'A');
        
        //approach 3  --- using constructor
		Student stu=new Student(102, "hussain", 'A');
		
        stu.show();
	}

}
