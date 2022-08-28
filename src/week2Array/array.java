package week2Array;
import java.util.*;
public class array {

	public static void main(String[] args) {
		
		
		int num[]= {47,84,75,21,14,14,79};
		double median=0;
		Arrays.sort(num);
		   
		    
		//Median
		if(num.length%2==1){
			median=num[(num.length+1)/2-1];
		}
		else{
			median=(num[num.length/2-1]+num[num.length/2])/2;
		}
		
	    System.out.println("Median :"+median);
	    
	   
	    //Highest value
		int max = num[0];
        
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];
        }
		       
        System.out.println("Highest value :"+max);
        
        
        //Mode
        
        int maxCount=0;
        int maxValue=0;
        for (int i = 0; i < num.length; ++i) {
        	int count = 0;
           for (int j = 0; j < num.length; ++j) {
              if (num[j] == num[i])
              ++count;
           }
           
           if (count > maxCount) {
             
              maxValue = num[i];
              maxCount = count;
           }
        }
        System.out.println("Mode :"+maxValue);
	    
	    
        System.out.println(" ");
        System.out.println("Prime numbers ");
        
        
        
        
        for (int i = 0; i <= num.length; i++){ 		  	  
        	int prime=0;
        	int counter=0;
           for(int j =1; j<=num.length; j++){
        	   
              if(num[i]%j==0){
            	  counter++;
              }
           }
           
           if (counter <=2){
        	   
        	   prime=num[i];
        	   
           }
           
           System.out.println(prime);
        }
        
      }
    
        

	}


