package week4;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class folders {
	
   public static void main(String args[]) throws IOException {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Path: ");
	   String path=sc.nextLine();
	   
      //Creating a File object for directory
      File directoryPath = new File(path);
      //List of all files and directories
      File filesList[] = directoryPath.listFiles();
      System.out.println("List of files and directories in the specified directory:");
      for(File file : filesList) {
         System.out.println("File name: "+file.getName());
         System.out.println("File path: "+file.getAbsolutePath());
         System.out.println("Size :"+file.getTotalSpace());
         System.out.println(" ");
         
      }
      
      System.out.println("Enter File Name: ");
 	  String fileName=sc.nextLine();
 	
 	   
 	 String[] flist = directoryPath.list();
 	 int flag = 0;
     if (flist == null) {
         System.out.println("Empty directory.");
     }
     else {

         // Linear search in the array
         for (int i = 0; i < flist.length; i++) {
             String filename = flist[i];
             if (filename.equalsIgnoreCase(fileName)) {
                 System.out.println(filename + " found");
                 flag = 1;
             }
         }
     }

     if (flag == 0) {
         System.out.println("File Not Found");
     }
   }
}