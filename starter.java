import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class starter implements InputKeyControl//,InputControl
{
		static Hangman a;
		
        public static void main(String args[])
        {
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			// MouseController mC = new MouseController(Canvas.getInstance(),new starter());

			a = new Hangman();
			EasyReader r = new EasyReader();
		}
	
		public void keyPress(String s)
		{
			a.guessLetter(s);
		}
		
		// public void onMouseClick(double x, double y)
		// {
			
	
		// }
		
		
		
		
}



