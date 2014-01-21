package stupid;

public class Dumber extends Dumb //Inherites the Dumb.
{

	public Dumber(int blerg)
	{
		super(9); //super access parent class
		super.doNothing(); //Access private method
	}


	//public int getBlerg() //Don't get private with inheritance, but you get everything public.
							//public setter/getter access private stuff.
	{
		this.setBlerg(7); //set blerg even though we don't have a blerg, but inheritance takes blerg from Dumb class.
		//return super.getBlerg() + 7;
	}
}
