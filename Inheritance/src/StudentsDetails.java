class Teacher{
String designation = "Teacher";
String collegename = "Mepco";
void disp()
{
	System.out.println("Physics");
}
}
	
public class StudentsDetails extends Teacher {
String mainsubject = "Teaching";	
	
	public static void main(String[] args) {
		StudentsDetails obj = new StudentsDetails();
		System.out.println(obj.collegename);
		System.out.println(obj.designation);
		obj.disp();
		System.out.println(obj.mainsubject);
		// TODO Auto-generated method stub

	}



}