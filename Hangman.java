import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Hangman// implements GameState //implements InputKeyControl//, InputControl
{
	private String targetString;
	private ArrayList<String> targetLetters;
	private ArrayList<String> guessedLetters;
	private Hook h;
	private OnScreenText o;
	
	private boolean
	//intialize hook 
	//intialize used letters/alphabet
	//		-array(list?) of text
	//intialize the word (from file)
	public Hangman()
	{
		EasyReader er = new EasyReader("WordList.txt");
		targetString = er.readLine();
		
		// System.out.println(targetString);
		
		targetLetters = new ArrayList<String>();
		guessedLetters = new ArrayList<String>();
	
		for(int i = 0; i < targetString.length(); i++)
		{
			targetLetters.add(targetString.substring(i,i+1));
		}

		h = new Hook();
		o = new OnScreenText(targetLetters);
	}
	
	public void guessLetter(String guess)
	{
		boolean guessed = false;
		
		
		for(int i = 0; i < guessedLetters.size(); i++)
		{
			if(guessedLetters.get(i).equalsIgnoreCase(guess))
			{
				guessed = true;
			}
		}
		guessedLetters.add(guess);
		
		if(guessed == false)
		{
			int count = 0;
			
			for(int i = 0; i < targetLetters.size(); i++)
			{
				if(targetLetters.get(i).equalsIgnoreCase(guess))
				{
					count++;
				}
			}
			
			o.updateLetter(guess);	
			
			if(count == 0)
			{
				h.addBodyPart();
			}
		}
	}

	public String toString()
	{
		System.out.println(targetLetters);
		
		return targetString;
	}
	
	//Gamestate methods
		// boolean isGameOver()
			// true if man complete

		// Player getWinner();
			//you or the cpu
		 
		// Player getCurrentPlayer();
			// return "Guesser"

		// ArrayList<String> getCurrentMoves();
			// just return un guessed letters

	public void makeMove(String move)
	{
		guessLetter(move);
	}

		// String toString();
			// Man 4/12
			// unused letters?
}



// notes: 
// 			difficulty setting might not be able to be implemented
//		 
//			merge hook and Person






