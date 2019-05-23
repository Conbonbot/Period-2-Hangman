import pkg.*;
import java.util.Arrays;

public class GameDriver
{
 private GameState state; // The current state of the game

 public GameDriver(GameState initial)
 { state = initial; }

 /** Plays an entire game, as described in the problem description
  */
 public void play()
 {
	int round = 0;
	while(!state.isGameOver())
	{
		Player p = state.getCurrentPlayer();
		String move = p.getNextMove(state);
		if(round<0)
		{
			
		}
		else if((round>0)&&(round<10))
			System.out.println("Round " + round + "  " + p.getName() + ": " + move);
			
		else if (round>10)
			System.out.println("Round " + round + " " + p.getName() + ": " + move);	
	
		state.makeMove(move);
		round++;
	}
	
	System.out.print(state.toString());
	// System.out.println();
	// state.printBoard();

	if(state.getWinner() == null)
	{
		System.out.print(state.getCurrentPlayer().getName()+" Drew or Lost");
	}
	
	if(state.getWinner() != null)
	{
		System.out.print(state.getWinner().getName() + " wins");
	}
			
 }
}
