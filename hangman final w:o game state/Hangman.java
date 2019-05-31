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
    
    
	public Hangman(String a)
	{
        theword=a;
        int spacer=20;
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
        int wrongX= 30;
        int wrongY= 550;
        while(play)
        {
            System.out.println("What is your guess?");
            String g= read.readLine();
            index=a.indexOf(g);
            if (index==-1)
            {
                Text wrong= new Text(wrongX+20,wrongY, g);
                wrong.grow(25,30);
                wrong.draw();
                wrongX=wrongX+30;
                
            }
            
            while(index!=-1)
            {
                //temp= a.substring(index);
                Text right= new Text(under[index].getX()+20,under[index].getY()-50, a.substring(index, index+1));
                right.grow(25,30);
                right.draw();
                index= a.indexOf(g, index+1);
                }
            }
    }
    
    private void drawHang()
    {
        Line leg1= new Line(
        
    }
    public String toString()
    {

       return "the word is: "+ theword;
    }
}
