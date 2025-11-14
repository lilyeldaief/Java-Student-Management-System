
public class Student {

	private String name;
	private int ID;
	private String email;
	private double gpa;
	
	public Student(String name, int ID, String email, double gpa)
	{
		this.name=name;
		this.ID=ID;
		this.email=email;
		this.gpa=gpa;
	}
	public String getname()
	{
		return name;
	}
	public int getID()
	{
		return ID;
	}
	public String getemail()
	{
		return email;
	}
	public double getGpa()
	{
		return gpa;
	}
	@Override
	public String toString() {
	    return "Name: " + name + ", Student ID: " + ID + ", GPA: " + gpa + ", Email: " + email;
	}

}
