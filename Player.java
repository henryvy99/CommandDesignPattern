/**
 * Player class that will be used for executing
 * @author henryvy
 *
 */
public class Player 
{
	/**
	 * Player method 
	 */
	public Player()
	{
		System.out.println("Our hero is born");
	}
	
	/**
	 * jump method for JumpCommand class
	 */
	public void jump()
	{
		System.out.println("Our hero jumps over a tall building");
	}
	
	/**
	 * fire method for FireCommand class
	 */
	public void fire()
	{
		System.out.println("Our hero squirts his water gun, far into the sky");	
	}
	
	/**
	 * run method for RunCommand class
	 */
	public void runForward()
	{
		System.out.println("Our hero sprints faster than all the cars");
	}
}
