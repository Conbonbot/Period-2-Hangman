import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;


public class Player /*implements InputControl, InputKeyControl*/
{	
	String name;
	
	public Player(String aName)
	{name = aName;}
	
	
	public String getName()
	{return name;}
	
	public String getNextMove(GameState state)
	{
		ArrayList<String> moves = state.getCurrentMoves();
		int r = (int)(Math.random()*moves.size());
		return moves.get(r);
	}
}
