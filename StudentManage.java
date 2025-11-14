
public class StudentManage {

	Student s[];
	int max;
	int count;
	
	public StudentManage(int max)
	{
		this.max=max;
		s= new Student[max];
		count=0;
	}
	public void addStudent(Student x)
	{
		if(count==max)
		{
			System.out.print("no space");
		}
		else
		{
			s[count]=x;
			count++;
		}
	}
	public void removeStudent(int id)
	{
		boolean flag=false;
		for(int i=0; i<count; i++)
		{
			if(s[i].getID()==id)
			{
				for(int j=i; j<count-1;j++)
				{
					s[j]=s[j+1];
				}
				flag=true;
				count--;
				break;
			}
			
			
		}
		if (flag==false)
		{
			System.out.println("Student not found");
		}
	}
	public Student searchStudent(int id)
	{
		
		for(int i=0; i<count;i++)
		{
			int iD= s[i].getID();
			if(id==iD)
			{
				
				return s[i];
			}
		}
		return null;
	}
	public void displayAll()
	{
		if(count==0)
		{
			System.out.println("No students available");
		}
		else
		{
			for(int i=0; i<count;i++)
			{
				System.out.print("Name: " + s[i].getname() + " " + "Student ID:"+ s[i].getID() + "GPA:"+ s[i].getGpa() + "Student email:"+ s[i].getemail());
				System.out.println();
			}
		}
	}
}
