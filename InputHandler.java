import java.util.HashMap;

/**
 * InputHandler class that will store commands in a HashMap and call it to the main driver
 * @author henryvy
 *
 */
public class InputHandler 
{
	/**
	 * commands that will store commands in a HashMap
	 */
	private HashMap<String, Command> commands = new HashMap<String, Command>(); // Have to pass in object when using hashmap
	
	/**
	 * Constructor, it will initialize the commands by a string
	 * @param player
	 */
	public InputHandler(Player player)
	{
		commands.put("jump", new JumpCommand(player));
		commands.put("run", new RunCommand(player));
		commands.put("fire", new FireCommand(player));
		commands.put("quit", new QuitCommand(player));
	}
	
	/**
	 * This will execute the command based on the string passed in
	 * @param button
	 */
	public void buttonPressed(String button)
	{
		commands.get(button).execute();
	}
}
