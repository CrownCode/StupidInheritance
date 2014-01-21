package stupid;

public class Dumbest extends Dumber
{

	public Dumbest(int blerg)
	{
		super(9); //Dumber has super of 9, then changes it to 15
		this.setBlerg(15); //Calling a method without writing a method out, this method is in Dumb, so it is calling it from there.
		//Dumbest gets knowledge from Dumber, Dumber gets knowledge from Dumb.
		//I can't inherit from Grandparents, but can inherit knowledge from Parents which got there knowledge from Grandparents.
	}

}
