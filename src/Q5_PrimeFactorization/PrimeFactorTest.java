package Q5_PrimeFactorization;

public class PrimeFactorTest {
	public static void main(String[] args) {
        PrimeFactorizer primeFactorizer = new PrimeFactorizer(72);
        primeFactorizer.compute();
        System.out.println(primeFactorizer);
        System.out.println(primeFactorizer.toString1());

        primeFactorizer = new PrimeFactorizer(60);
        primeFactorizer.compute();
        System.out.println(primeFactorizer);
        System.out.println(primeFactorizer.toString1());
        
        primeFactorizer = new PrimeFactorizer(144);
        primeFactorizer.compute();
        System.out.println(primeFactorizer);
        System.out.println(primeFactorizer.toString1());
        
        primeFactorizer = new PrimeFactorizer(120);
        primeFactorizer.compute();
        System.out.println(primeFactorizer);
        System.out.println(primeFactorizer.toString1());
        
        primeFactorizer = new PrimeFactorizer(288);
        primeFactorizer.compute();
        System.out.println(primeFactorizer);
        System.out.println(primeFactorizer.toString1());
        
        primeFactorizer = new PrimeFactorizer(13);
        primeFactorizer.compute();
        System.out.println(primeFactorizer);
        System.out.println(primeFactorizer.toString1());
        
        primeFactorizer = new PrimeFactorizer(2);
        primeFactorizer.compute();
        System.out.println(primeFactorizer);
        System.out.println(primeFactorizer.toString1());
    }

}
