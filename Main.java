
public class Main {

	    public static void main(String[] args) {
	        StudentManage manager = new StudentManage(10);

	        manager.addStudent(new Student("Mariam", 101, "mariam@gmail.com", 3.7));
	        manager.addStudent(new Student("Omar", 102, "omar@gmail.com", 3.4));
	        manager.displayAll();

	        System.out.println(manager.searchStudent(102));
	        manager.removeStudent(101);
	        manager.displayAll();
	    }
	

}
