/**
 * JumpCommand class that implements Command interface
 * @author henryvy
 *
 */
public class JumpCommand implements Command
{
	Player player;
	
	/**
	 * Constructor that sets player
	 * @param player
	 */
	public JumpCommand(Player player)
	{
		this.player = player;
	}
	
	/**
	 * method that will be called in InputHandler
	 */
	public void execute()
	{
		player.jump();
	}
	
	public String getName()
	{
		return "Our hero jumps over a tall building";
	}
}
