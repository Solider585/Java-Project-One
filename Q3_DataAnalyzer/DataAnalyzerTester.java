package Q3_DataAnalyzer;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;


public class DataAnalyzerTester {
	private static Scanner scan = new Scanner(System.in); //or was it this?
	@SuppressWarnings("unused")
	private static Scanner write_in;
	private static FileWriter insert_to_file;

	public static void main(String [] args) throws Exception {
		
		LinkedList<Integer> numList = new LinkedList<>();
		String number;
		String user;
		
		try {
//			write_in = new Scanner(System.in);
			write_in = new Scanner(args[0]); //is this what you meant with that comment made?
			String file_name;
			
			System.out.println("Type the name you want to give the file.");
//			file_name = write_in.nextLine();
			file_name = args[1];
			
			File output = new File("D:\\School Folder\\COP4331 Java\\Homework1\\");
			File create  = new File(file_name);
		
		
			if(output.createNewFile() || create.createNewFile()) {
				System.out.println("The File has been created:" + create.getName());
				System.out.println("The File has been created:" + output.getName());
			}
			else {
				System.out.println("File exists already.");
			}		
		
			insert_to_file = new FileWriter(file_name);
		
		} catch(IOException ex) {
			System.out.println("failed to create the file.");
			throw ex;
		}
		
		System.out.print("Would you like to input a number to the list?");	
//		write_in.nextLine();
		user = scan.nextLine();
		
		while(DataAnalyzer.isYes(user) == true) {
			System.out.println("Enter a number for the list.");
			try {
				number = scan.next();
				int num = Integer.parseInt(number);
				if(num != (int)num) {
					throw new Exception("This is not an integer.");
				}
				numList.add(num);
				insert_to_file.write("\n" + num);
				}catch (Exception e) {
					System.out.println("The input was not an integer.");
					throw e;
				}
				
			System.out.print("Would you like to input more numbers?");
			scan.nextLine();
			user = scan.nextLine();
            DataAnalyzer.isYes(user); //calling new boolean function I created to replacing switch statement which did house it at one point in the function before I changed it again
		}
			
		DataAnalyzer analyze_object = new DataAnalyzer(numList);
		try {
			int min = analyze_object.min(), max = analyze_object.max(), avg = analyze_object.average();
			System.out.println("The minimum value of your inputs is: " + min);
			insert_to_file.write("\nMinimum value = " + min);
				
			System.out.println("The Maximum value of your inputs: " + max);
			insert_to_file.write("\nMaximum value = " + max);
				
			System.out.println("The averages of all your inputs: " + avg);
			insert_to_file.write("\nAverage value = " + avg);
				
			insert_to_file.close();
		}catch (Exception empty){
			System.out.println("The number list is empty.");
			throw empty;
		}
		
	}

}
