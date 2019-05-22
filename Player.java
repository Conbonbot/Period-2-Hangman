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

// C:\Users\Nilesh\Desktop\Gamestate Knight Grpahics>java -cp .; starter
// Round 1  Knight: Direction 7= R: -2 C: -1
// Round 2  Knight: Direction 4= R: +2 C: -1
// Round 3  Knight: Direction 3= R: +2 C: +1
// Round 4  Knight: Direction 1= R: -1 C: +2
// Round 5  Knight: Direction 1= R: -1 C: +2
// Round 6  Knight: Direction 1= R: -1 C: +2
// Round 7  Knight: Direction 6= R: -1 C: -2
// Round 8  Knight: Direction 4= R: +2 C: -1
// Round 9  Knight: Direction 4= R: +2 C: -1
// Round 11 Knight: Direction 0= R: -2 C: +1
// Round 12 Knight: Direction 3= R: +2 C: +1
// Round 13 Knight: Direction 4= R: +2 C: -1
// Round 14 Knight: Direction 4= R: +2 C: -1
// Round 15 Knight: Direction 1= R: -1 C: +2
// Round 16 Knight: Direction 6= R: -1 C: -2
// Round 17 Knight: Direction 0= R: -2 C: +1
// Round 18 Knight: Direction 7= R: -2 C: -1
// Round 19 Knight: Direction 5= R: +1 C: -2
// Round 20 Knight: Direction 4= R: +2 C: -1
// Round 21 Knight: Direction 7= R: -2 C: -1
// Round 22 Knight: Direction 7= R: -2 C: -1
// Round 23 Knight: Direction 2= R: +1 C: +2
// Round 24 Knight: Direction 4= R: +2 C: -1
// Round 25 Knight: Direction 3= R: +2 C: +1
// Round 26 Knight: Direction 3= R: +2 C: +1
// Round 27 Knight: Direction 1= R: -1 C: +2
// 23  2   0   0   0   8   0   0
// 0   0   24  0   0   19  12  7
// 3   22  1   20  9   6   0   0
// 0   25  0   5   0   11  18  13
// 0   4   21  10  0   0   0   0
// 0   0   26  0   0   17  14  0
// 0   0   0   0   0   28  0   16
// 0   0   0   27  0   15  0   29
// Knight Drew or Lost
// C:\Users\Nilesh\Desktop\Gamestate Knight Grpahics>pause
// Press any key to continue . . .