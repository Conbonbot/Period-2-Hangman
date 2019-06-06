import pkg.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class starter implements InputControl
{
    private Hangman a;
        public static void main(String args[])
		{
            MouseController mC = new MouseController(Canvas.getInstance(),new starter());
            firstPage b= new firstPage();

			
		}
    public void onMouseClick(double xx, double yy)
    {
        if((20<xx && xx<270) && (250<yy && yy<350))
        {
            System.out.println("type a category: nature, teachers, or comp sci");
            EasyReader read= new EasyReader();
            String word= read.readLine();
            a= new Hangman(word);
            
        }
        else if((330<xx && xx<580) && (250<yy && yy<350))
        {
            
            System.out.println("What would your friend like the word to be:");
            EasyReader read= new EasyReader();
            String word= read.readLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            a= new Hangman(word);
        }
       
        
    }
			
}

