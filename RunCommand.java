/**
 * RunCommand class that implements Command interface
 * @author henryvy
 *
 */
public class RunCommand implements Command
{
	Player player;
	
	/**
	 * Constructor that sets player
	 * @param player
	 */
	public RunCommand(Player player)
	{
		this.player = player;
	}
	
	/**
	 * method that will be called in InputHandler
	 */
	public void execute()
	{
		player.runForward();
	}
	
	public String getName()
	{
		return "Our hero sprints faster than all the cars";
	}
}
