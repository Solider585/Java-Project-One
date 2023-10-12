package Q2;

public class Greeter
{
   /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      this.name = aName;
   }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }
   
   /*
    *  	Write a new method for the Greeter class,
	* 	public void swapNames(Greeter other) {...}
	*	that swaps the names of this greeter and another instance.	
    */
   public void  swapNames(Greeter other) {
	   String swap;
	   
	   swap = this.name;
	   this.name = other.name;
	   other.name = swap;
	   
   }
   
   /*
    * 	write a new method for the Greeter class:
   	*	public Greeter createQualifiedGreeter(String qualifier) { ..... }
	*	that returns a new Greeter object with its name being the qualifier string followed by
	*	" " and the executing greeter's name (i.e. this.name).
	*	For example:
	*	Greeter g = new Greeter("world");
	*	Greeter g2 = g.createQualifiedGreeter("beautiful");
	*	g2.name will be the string "beautiful world"
    */
   public Greeter createQualifiedGreeter(String qualifier) {
	   String addTo = qualifier + " " + this.name;	   
	   return new Greeter(addTo);
   }

   private String name;

}
