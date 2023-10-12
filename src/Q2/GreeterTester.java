package Q2;

public class GreeterTester {
    /**
    main code sequence. Instantiate two Greeters and invoke sayHello().
   */  
   public static void main(String[] args)
   {
	// no need for package name:
	System.out.println("What is given from book for Hello World.");
	Greeter worldGreeter = new Greeter("World");
	System.out.println(worldGreeter.sayHello());

	// use fully qualified class name, with package:
	Q2.Greeter usaGreeter = new Q2.Greeter("USA");
	System.out.println(usaGreeter.sayHello());
	
	
	System.out.println("----------------------");
	System.out.println("Now to Test new functions added.");
	System.out.println("Testing the swap function");
	worldGreeter.swapNames(usaGreeter);
	System.out.println(worldGreeter.sayHello());
	System.out.println(usaGreeter.sayHello());
	
	System.out.println("--------------------");
	System.out.println("Testing createQualifiedGreeter function");
	
	Greeter g = new Greeter("World");
	Greeter g2 = g.createQualifiedGreeter("Beautiful");
	String g3 = g2.sayHello();
	System.out.println(g3);
	
	Greeter qualifyTest = new Greeter("Go");
	Greeter createTest = qualifyTest.createQualifiedGreeter("Lets");
	String finishedTest = createTest.sayHello();	
	System.out.println(finishedTest);
	
   }
   
}
