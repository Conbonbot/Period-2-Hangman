import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Hangman// implements GameState //implements InputKeyControl//, InputControl
{
	private String targetString;
	private ArrayList<String> targetLetters;
	private ArrayList<String> guessedLetters;
	private String dif;
	
	//intialize hook 
	//intialize used letters/alphabet
	//		-array(list?) of text
	//intialize the word (from file)
	public Hangman()
	{
		EasyReader er = new EasyReader("WordList.txt");
		targetString = er.readLine();
		
		System.out.println(targetString);
		
		targetLetters = new ArrayList<String>();
	
		for(int i = 0; i < targetString.length(); i++)
		{
			targetLetters.add(targetString.substring(i,i+1));
		}

	}
	
	public Hangman(String difficulty)
	{	
		dif = difficulty;
		if(dif.equalsIgnoreCase("easy"))
		{
			
		}
		
		//changes how many guesses it can take
	}
	 
	
	public void guessLetter(String guess)
	{
		temp.add
	}
	
	private void addBodyPart()
	{
		
	}	
	
	public String toString()
	{
		System.out.println(targetLetters);
		
		return targetString;
	}
	
	//Gamestate methods
		// boolean isGameOver(); 
			// true if man complete

		// Player getWinner();
			//you or the cpu
		 
		// Player getCurrentPlayer();
			// return "Guesser"

		// ArrayList<String> getCurrentMoves();
			// just return un guessed letters

		// void makeMove(String move);
			// guessLetter

		// String toString();
			// Man 4/12
			// unused letters?
}