package stupid;

public class Dumb 
{
	private int blerg; //Only put class values in Constructors and null if not defned.
	private Car myCar; 
	
	public Dumb(int blerg)
	{
		this.blerg = blerg;
		myCar = new Car();
	}
	
	//Getters and Setters for Constructor Values.
	public Car getMyCar() 
	{
		return myCar;
	}


	public void setMyCar(Car myCar) 
	{
		this.myCar = myCar;
	}


	public int getBlerg() 
	{
		return blerg;
	}


	public void setBlerg(int blerg)
	{
		this.blerg = blerg;
	}


	protected void doNothing() //private method no inherited, cannot be accessed.
	{
		
	}
}
