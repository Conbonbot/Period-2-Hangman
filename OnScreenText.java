import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class OnScreenText // implements GameState //implements InputKeyControl//, InputControl
{
	private ArrayList<Text> alphaText;
	private ArrayList<String> alphabet;
	
	private ArrayList<Text> targetText;
	private ArrayList<String> targetLetters;

	// initialize the alphabet
	// 
	public OnScreenText(ArrayList<String> letters)
	{
		int x = 300;
		int y = 100;
		
		alphaText = new ArrayList<>();
		alphabet = new ArrayList<>();
		
		targetText = new ArrayList<>();
		targetLetters = letters;
		
		Text availableLetters = new Text(350, 75, "Guessed Letters in Red");
		availableLetters.draw();
		
		String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i = 0; i < all.length(); i++)
		{
			
			String let = all.substring(i,i+1);
			Text t =  new Text(x, y, let);
			alphabet.add(let);
			alphaText.add(t);
			alphaText.get(i).draw();	
			
			if(i == 12)
			{
				x = 280;
				y += 20;
			}
			
			x+=20;
		}
		
		x = 300;
		y = 200; 
		
		for(int i = 0; i < letters.size(); i++)
		{
			if(!letters.get(i).equalsIgnoreCase(" "))
			{
				Line l = new Line(x,y,x+15,y);
				l.draw();
				
				Text temp = new Text(x,y-20,letters.get(i));
				targetText.add(temp);
			}
			
			else
			{	
		
				Text temp = new Text(x,y-20,letters.get(i));
				targetText.add(temp);
				
				x=265;
				y+=30;
			}	
			x = x + 35;
		}
	}
	
	public void updateLetter(String a)
	{
		for(int i = 0; i < alphabet.size(); i++)
		{
			// System.out.println(alphabet.get(i));
			
			if(alphabet.get(i).equalsIgnoreCase(a))
			{	
				alphaText.get(i).setColor(Color.RED);
			}
		}
		
		for(int i = 0; i < targetText.size(); i++)
		{
			if(targetLetters.get(i).equalsIgnoreCase(a))
			{
				targetText.get(i).draw();
			}
		}
	}
	
	
}