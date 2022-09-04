package week3;
import java.util.*;
public class studentMark {
	
	

	public static void main (String [] args)
    {
		student st=new student();
        Scanner sc=new Scanner(System.in);
        System.out.println("How many student are there: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter first name: ");
            st.setFirstName(sc.nextLine());
            System.out.print("Enter Last name: ");
            st.setLastName(sc.nextLine());
            System.out.print("Enter Subject: ");
            st.setSubject(sc.nextLine());
            
            System.out.println(st.getName());
            System.out.println(st.getSubject());
            st.setAvg();
            //System.out.println("Grade is "+st.getGrade());
            
        }
        /*
        System.out.println(st.getName());
        System.out.println(st.getSubject());
        st.getMark();
        System.out.println("Grade is "+st.getGrade());
    */

      
    }
}

