import java.util.ArrayList;

public class Student {
public int studId;
public String studNm;
public int getStudId() {
	return studId;
}
public void setStudId(int studId) {
	this.studId = studId;
}
public String getStudNm() {
	return studNm;
}
public void setStudNm(String studNm) {
	this.studNm = studNm;
}
@Override
public String toString() {
	return "Student [studId=" + studId + ", studNm=" + studNm + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studId, String studNm) {
	super();
	this.studId = studId;
	this.studNm = studNm;
}
 

}
class StudImpl{
	
	Student[]studlist=new Student[10];
	int index=0;
	
	public int addStud(Student stw){
	studlist[index]=stw;	
		index++;
		return stw.getStudId();
	}	
	
	public Student getstudent(int sid){
		for(int i=0;i<=index;i++){
		Student s=studlist[i];
		
		if(s.getStudId()==sid){
			return s;
		
		
	}
		}
		return null;
	}

	public Student[] getAllStudent() {
		// TODO Auto-generated method stub
		return studlist;
	}
	
}