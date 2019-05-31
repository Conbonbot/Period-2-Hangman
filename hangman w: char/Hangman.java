import pkg.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Hangman
{
    
    private boolean state;
    Player win;
    private String[] b;
    private EasyReader read;
    private String line;
    private String theword;
    private ArrayList<Object> person;
    
    
	public Hangman(String a)
	{
        theword=a;
        int spacer=20;
        drawHang();
        //Picture hang= new Picture("hangmannobackground.jpg");
        //hang.draw();
        Line[] under= new Line[a.length()];
        
        int count=0;
        for(int b=1; b<a.length()+1; b++)
        {
            //makes lines for each letter unless its a space
            if(!a.substring(b-1,b).equals(" "))
            {
                under[count]= new Line(spacer, 500, spacer+50, 500);
                under[count].draw();
                spacer= spacer+ 80;
                count++;
            }
            if(a.substring(b-1,b).equals(" "))
            {
                count++;
                spacer=spacer + 50;
            }
        }
        boolean play= true;
        int index=0;
        read = new EasyReader();
        String temp="";
        int wrongX= 10;
        int wrongY= 550;
        while(play)
        {
            System.out.println("What is your guess?");
            char g= read.readChar();
            String guess= Character.toString(g);
            index=a.indexOf(guess.toUpperCase());
            
            if (index==-1)
            {
                Text wrong= new Text(wrongX+40,wrongY, guess);
                wrong.grow(15,20);
                wrong.draw();
                wrongX=wrongX+30;
                
            }
            
            while(index!=-1)
            {
                //temp= a.substring(index);
                Text right= new Text(under[index].getX()+20,under[index].getY()-50, a.substring(index, index+1));
                right.grow(15,20);
                right.draw();
                index= a.indexOf(guess.toUpperCase(), index+1);
                }
            }
    }
    
    private void drawHang()
    {
        Line leg= new Line(50, 350, 150, 350);
        leg.draw();
        Line line= new Line(100, 350, 100, 150);
        line.draw();
        Line hline= new Line(100, 150, 200, 150);
        hline.draw();
        Line noose= new Line(200, 150, 200,180);
        noose.draw();
    }
    private void guessWrong(int num)
    {
        ArrayList<Object> person= new ArrayList<Object>();
        
    }
    public String toString()
    {

       return "the word is: "+ theword;
    }
}
