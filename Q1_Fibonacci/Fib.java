package Q1_Fibonacci;
import java.util.Scanner;

public class Fib {
	//constructor
	public Fib(int f0, int f1) {
		this.f0 = f0;
		this.f1 = f1;
	}
	
	// computes F(n) using an ***iterative*** algorithm, 
	//where F(n) = F(n-1) + F(n-2) is the recursive definition.
	// use instance variables that store F(0) and F(1).
	// check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.
	public long f(int n) throws Exception {	
		if(n < 0) {
			System.out.println("n is a negative integer.");
			throw new Exception("n is negative, should be positive or zero.");
		}else {
			switch(n) {
			case 0:
				return f0;
			case 1:
				return f1;
			default:
				int fibo1 = f0, fibo2 = f1, fibonacci = 0;
				for(int i = 2; i <= n; i++) {
					fibonacci = fibo1 + fibo2;
					fibo1 = fibo2;
					fibo2 = fibonacci;
				}
				return fibonacci;
			}
		}			
	}
	
	//computes F(n) using the ***recursive*** algorithm, 
	//where F(n) = F(n-1) + F(n-2) is the recursive definition.
	// use instance variables that store F(0) and F(1).
	// check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.
	public long fRec(int n) throws Exception {
		if(n < 0) {
			System.out.println("n is a negative integer.");
			throw new Exception("n is negative, should be positive or zero.");
		}else {
			switch(n) {
			case 0:
				return f0;
			case 1:
				return f1;
			default:
				return fRec(n-1) + fRec(n-2);
			}
		}		
			
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Enter integer values for F0, F1, and N.");
		// get numbers F(0) and F(1) from args[0] and args[1].
		// use either the Scanner class or Integer.parseInt(args[...])
		// you must handle possible exceptions !
		try {
			System.out.println("F0 = ");
//			input_f0 = new Scanner(System.in);  not needed anymore
			int f0 = input_f0.nextInt();
				
			System.out.println("F1 = ");
//			input_f1 = new Scanner(System.in);
			int f1 = input_f1.nextInt();
				
			// get n from args[2]:
			System.out.println("Enter the value of N to compute F(n).");
//			nValue = new Scanner(System.in);
			int n = nValue.nextInt();
	
			// create a Fib object with params F(0) and F(1)
			Fib fibonacci = new Fib(f0, f1);
			
			
			// calculate F(0), ..., F(n) and display them with System.out.println(...) using			
			// the iterative method f(i)			
			System.out.println("Calculating F(n) using iterative method ending with F(n) = " + fibonacci.f(n));
			for(int i = 0; i <= n; i++) {
				System.out.println(fibonacci.f(i));
			}
			
			System.out.println("--------------------------");
				
			// calculate F(0), ..., F(n) and display them with System.out.println(...) using
			// the recursive method fRec(i)				
			System.out.println("Calculating F(n) using recurssive method ending with F(n) = " + fibonacci.fRec(n));
			for(int i = 0; i <= n; i++) {
				System.out.println(fibonacci.fRec(i));
			}
			System.out.println("--------------------------");
			
		} catch(Exception  ex) {
			System.out.println("Exception caught. n must be poisive" + ex);
			throw ex;
		}			 
        		
	}
	
	// instance variables store F(0) and F(1):
	private final int f0;
	private final int f1;
	private static Scanner input_f0 = new Scanner(System.in);
	private static Scanner input_f1 = new Scanner(System.in);
	private static Scanner nValue = new Scanner(System.in);

}
