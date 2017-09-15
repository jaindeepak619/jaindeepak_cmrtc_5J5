import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit

			StudentGroup stu = new StudentGroup(4);
			Date date = new Date();
			Student student1 =new Student(22,"deeapak",date,2.5);
			Student student2 =new Student(23,"deea",date,2.5);
			Student[] students =new Student[2];
			students[0]=student1;
			students[1]=student2;
			stu.setStudents(students);


	}

}
