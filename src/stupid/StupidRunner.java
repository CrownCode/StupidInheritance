package stupid;

public class StupidRunner 
{
	public static void main(String [] args)
	{
		Dumb Lloyd = new Dumb(7); //Lloyd as Dumb
		Dumber Harry = new Dumber(9); //Harry as Dumber
		Dumbest George = new Dumbest(15); //George is Dumbest
		
		System.out.println("Let's test inheritance!");
		System.out.println("Lloyd is dumb and his blerg is:" + Lloyd.getBlerg());
		System.out.println("Harry is dumber and his blerg is:" + Harry.getBlerg());
		System.out.println("Let's test more inheritance!");
		Harry.setBlerg(45); // Dumber doesn't have a setBlerg method, but now its calling super.setBlerg();
		System.out.println("harry is dumber and his blerg is: " + Harry.getBlerg());
		System.out.println("Lloyd is dumb and his blerg is: " + Lloyd.getBlerg());
		System.out.println("Harry's car: " + Harry.getMyCar());
		System.out.println("George's car: " + George.getMyCar());
		System.out.println("Automagically is the magic that is Automatic");
	}
}
