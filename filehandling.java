package filehandling;  //package name - groups related classes
import java.io.*;       //import input/output classes
import java.util.Scanner;     //import scanner class to read user input

//Task 1 - File Handling Utility
// This Java program demonstrates how to read, write, and modify (append) a text file.
// Internship: CODTECH - Java Internship
 

public class FileUtility 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);   //create scanner object to read user input from keyboard
		//define path of the file to read/write/append
		//file is inside 'src/filehandling' folder of the project
        String filename = "src/filehandling/myfile.txt"; //File to Use
        
        //print options to the user
        System.out.println("Choose an option");
        System.out.println("1. Write to File");
        System.out.println("2. Read from file");
        System.out.println("3. Append to file");
        System.out.print("Enter your choice (1/2/3): ");
        
        int choice = sc.nextInt();   //Read integer choice from user(1,2,3)
        sc.nextLine();     //  the newline left by nextInt()
        
        try
        {
        	if(choice==1)
        	{
        		System.out.println("Enter text to write:");
        		String text = sc.nextLine();     // Take user input
        		FileWriter writer = new FileWriter("src/filehandling/myfile.txt");
        		
        		writer.write(text);      // Write to file
        		writer.close();              //// Close the file
        		System.out.println("Text written successfully.");
        		System.out.println("File path: " + new File("src/filehandling/myfile.txt").getAbsolutePath());
        		
        	}
        	else if(choice==2)
        	{
        		BufferedReader reader = new BufferedReader(new FileReader("src/filehandling/myfile.txt"));
        		
        		String line;
                System.out.println("File content:");
                while ((line = reader.readLine()) != null) 
                {
                    System.out.println(line); // Print each of the
                   
                }
        	}
        	else if (choice == 3)
        	{
        		System.out.print("Enter text to append: ");
                String text = sc.nextLine();
                FileWriter writer = new FileWriter("src/filehandling/myfile.txt" , true);   // Append mode
                writer.write("\n" + text); // Adds new text at the end of the file
                writer.close();  //ensure data is written
                System.out.println("Text appended successfully.");
        	}
        	else
        	{
        		 System.out.println("Invalid choice.");
        	}
        	
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred:");
            e.printStackTrace();  //show me error in the console
        }
        

	}

}
