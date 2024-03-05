package task4;
public class Student {
	public int rollNo;
	public String name;
	public String dept;
	public double cgpa;
	public Student(int rollNo,String name,String dept,double cgpa) {
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	public String toString() {
		return "Roll No : "+rollNo+"\nName : "+name+"\nDepartment : "
				+dept+"\nCGPA : "+cgpa;
	}
}
