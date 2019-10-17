/**
 * FireCommand class that implements Command interface
 * @author henryvy
 *
 */
public class FireCommand implements Command
{
	Player player;
	
	/**
	 * Constructor that sets player
	 * @param player
	 */
	public FireCommand(Player player)
	{
		this.player = player;
	}
	
	/**
	 * method that will be called in InputHandler
	 */
	public void execute()
	{
		player.fire();
	}
	
	public String getName()
	{
		return "Our hero squirts his water gun, far into the sky";
	}
}
