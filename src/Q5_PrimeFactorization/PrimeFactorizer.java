package Q5_PrimeFactorization;

import java.util.ArrayList;

public class PrimeFactorizer {
	private int number;
	private ArrayList<Integer> exponents;
	private ArrayList<Integer> primeNumber;

	 /**
     * Initialize the object with target number n.
     *
     * @param n
     */
	public PrimeFactorizer(int n) {
		this.number = n;
		this.primeNumber = null;
		this.exponents = null;
	}
	
	/**
	   * Return n, the target number.
	   */
	public int getN() {
		return number;
		
	}
	
	/**
	   * Compute factorization. Do not repeat operation if it was called before.
	   */
	public void compute() {
		primeNumber = new ArrayList<>();
		exponents = new ArrayList<>();
		int num = number, primeNumbers = 2, count = 0;

        while (num > 1) {
            while (num % primeNumbers == 0) {
                count++;
                num = num / primeNumbers;
            }
            if (count > 0) {
            	primeNumber.add(primeNumbers);
                exponents.add(count);
            }
            primeNumbers++;
            count = 0;
        }		
	}
	
	/**
	   * Return the factors and exponents in two arraylists. Call compute() first, if necessary.
	   * For instance, if n=60, primes=[2,3,5], and exponents=[2,1,1].
	   * This function overwrites the 'n' parameter passed to the constructor.
	   */
	@SuppressWarnings("unchecked")
	public void getFactorsAndExponents(int n, ArrayList<Integer> primes, ArrayList<Integer> exponents) {
		PrimeFactorizer primeFactorizer = new PrimeFactorizer(n);
        if (primeNumber == null) {
            primeFactorizer.compute();
        }
        primes = (ArrayList<Integer>) primeFactorizer.primeNumber.clone();
        exponents = (ArrayList<Integer>) primeFactorizer.exponents.clone();
	}
	
	/**
	   * Return a string with the "pretty" representation of the prime factorization.
	   * For instance, if n is 60, then toString() for the PrimeFactorizer(60) object
	   * should be "60 = 2^2*3*5". Call compute() if not done before.
	   */
	
	public String toString() {
		String result = number + " = ";
        String finished = result;
            
        for (int i = 0; i < primeNumber.size(); i++) {
            //finished = new String();
            //finished = result;
            if(i != 0){
                finished += " * ";
            }
            if (exponents.get(i) != 1) {
                finished +=  primeNumber.get(i) + "^" + exponents.get(i);
            } else {
                finished += primeNumber.get(i);
            }
            //finished = finished;
        }               
//        System.out.println(finished);       
        return finished;  
	}
	
	//got bored so added another way to build the string using String builder
	public StringBuilder toString1() {
		 StringBuilder formula = new StringBuilder(number + " = ");
	        for(int i = 0; i < primeNumber.size(); i++) {
	        	if(i != 0) {
	        		formula.append(" * ");
	        	}
	        	if(exponents.get(i) != 1) {
	        		formula.append(primeNumber.get(i) + "^" + exponents.get(i));
	        	} else {
	        		formula.append(primeNumber.get(i));
	        	}
	        }
//	        System.out.println(formula);
	        return formula;
	}

}
