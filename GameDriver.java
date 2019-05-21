import pkg.*;
public class GameDriver
{
	private GameState state;
	
	public GameDriver(GameState initial)
	{
		state = initial;
	}
	
	public void play()
	{
		System.out.println(state);
		while(!state.isGameOver())
		{
			Player s = state.getCurrentPlayer();
			String move = s.getNextMove(state);
			System.out.println(s.getName() + " -> " + move);
			state.makeMove(move);
		}
		
		Player winner = state.getWinner();
		
		if(winner != null)
			System.out.println(winner.getName() + " wins");
		else
			System.out.println("Game ends in a draw");
	}
}