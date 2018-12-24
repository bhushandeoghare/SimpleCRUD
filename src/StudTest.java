import java.util.Arrays;

public class StudTest {

	

	public static void main(String[] args) {
StudImpl studimp=new StudImpl();

Student s1=new Student(1,"Bhushan");
Student s2=new Student(2,"Akash");

int st1=studimp.addStud(s1);
int st2=studimp.addStud(s2);

System.out.println(studimp.getstudent(1));

System.out.println("----------Emp GetAll-----------");
Student [] arrayOfStuds = studimp.getAllStudent();
System.out.println(Arrays.toString(arrayOfStuds));
	}

}
