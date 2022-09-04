package week3;

import java.util.Scanner;

public class student {

	
	private String firstName; 
    private String lastName;
    private String subject;
    private float avg; 
    private char grade;
    
    
  public student(){
        String firstName; 
        String lastName;
        String subject;
        float avg; 
        char grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

public student( String fn,String ln,String sub)
{
    
    firstName = fn;
    lastName=ln;
    subject=sub;

}

public void setName(String fn,String ln)
{
    firstName = fn;
    lastName=ln;

}

public void setMark(float theMark)
{
    avg = theMark;
}

public void setGrade(char theGrade) {

    grade = theGrade;
}

public void setSubject(String sub){
    subject=sub;
}
public void setAvg() {
	float avg=0;
    try (Scanner sc = new Scanner(System.in)) {
		switch(subject){
		    case "English":
		        float[] a1=new float[2];
		        System.out.println("Enter marks");
 
		        for(int i=0;i<3;i++){
		            a1[i]=sc.nextFloat();
		            avg=(avg+a1[i])/3;
		        }
		    
		    
		    case "Science":
		        float[] a2=new float[3];
		        System.out.println("Enter marks");
 
		        for(int i=0;i<4;i++){
		            a2[i]=sc.nextFloat();
		            avg=(avg+a2[i])/4;
		        }
		       
		        
		    case "Maths":
		    	float[] a3=new float[7];
		        System.out.println("Enter marks");
 
		        for(int i=0;i<8;i++){
		            a3[i]=sc.nextFloat();
		            avg=(avg+a3[i])/8;
		        }
		}
    }
}
public String getName()
{
    return firstName+" "+lastName;
}

public String getSubject(){
    return subject;
}

public float getAvg() {
		return avg;
}

public char getGrade()
{


        if((avg > 90) && (avg <= 100))
                                grade = 'A';
        else if ((avg > 80) && (avg <= 89))
                                grade = 'B';
        else if ((avg > 50) && (avg <= 79))
                                grade = 'C';
        else if ((avg > 35) && (avg <= 49))
                                grade = 'D';
        else

        grade = 'E';

        return grade;
}
 
}
