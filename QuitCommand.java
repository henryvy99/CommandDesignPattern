/**
 * QuitCommand class that implements Command interface
 * @author henryvy
 *
 */
public class QuitCommand implements Command
{
	Player player;
	
	/**
	 * Constructor that sets player
	 * @param player
	 */
	public QuitCommand(Player player)
	{
		this.player = player;
	}
	
	/**
	 * method that will be called in InputHandler
	 */
	public void execute()
	{
		System.out.println("Game Over :(");
	}
	
	public String getName()
	{
		return "Game Over :(";
	}
}
