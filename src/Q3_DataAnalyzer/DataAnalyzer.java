package Q3_DataAnalyzer;

import java.util.LinkedList;

public class DataAnalyzer {
	private LinkedList<Integer> numbers;
	
	//constructor function
	public DataAnalyzer (LinkedList<Integer> numList) {
		this.numbers = numList;
	}
	
	//get minimum value from the list
	public int min() throws Exception {
		if(numbers == null) {
			throw new Exception("List is Empty.");
		}
		int minimum_number = numbers.get(0);
		for(int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i) < minimum_number) {
				minimum_number = numbers.get(i);
			}
		}
		return minimum_number;
	}
	
	//get maximum number of the list function
	public int max() throws Exception {
		if(numbers == null) {
			throw new Exception("List is Empty.");
		}
		int maximum = numbers.get(0);
		for(int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > maximum) {
				maximum = numbers.get(i);
			}
		}
		return maximum;
	}
	
	//get the average number of whole list function
	public int average() throws Exception {
		if(numbers == null) {
			throw new Exception("List is Empty.");
		}
		int average_number = 0;
		int sum = 0;
		int i;
		
		for(i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		
		average_number = sum / i;		
		return average_number;
		
	}
	
	//adding a boolean function to an inputed String and seeing if user wishes to add numbers to the list or leave it empty
	public static boolean isYes(String response) {
		//trimming incoming input of spaces to locate if first character is a y.
		//removed the previous Switch statement for 2 lines to run as opposed to 20 previously for fun
		String trimmed = response.trim();		
		return(trimmed.charAt(0) == 'y' || trimmed.charAt(0) == 'Y' ? true : false);
		
		
	}

}
