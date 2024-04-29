package Day8;

public class Student {
   int sid;
   String name;
   char grade;
   
   void show()
   {
	   System.out.println(sid+" "+name+" "+grade);
   }
   
   void setData(int id, String sname, char g)
   {
	   sid=id;
	   name=sname;
	   grade=g;
   }
    Student(int id, String sname, char g)
   {
	   sid=id;
	   name=sname;
	   grade=g;
   }
}
