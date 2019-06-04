import pkg.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.awt.Canvas;
import java.lang.Object;
import java.awt.Component;
public class Hangman implements InputControl
{
    
    private boolean state;
    Player win;
    private String[] b;
    private EasyReader read;
    private String line;
    private String theword;
    private ArrayList<Object> person;
    
    public Hangman()
    {
        Canvas a = new Canvas();
        String c = "mac";
        PlayHangman(c);
    }
	private void PlayHangman(String a)
	{
        theword=a;
        int spacer=20;
        drawHang();
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
        int countwrong=0;
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
                guessWrong(countwrong);
                countwrong++;
                
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
        if(num==0)
        {
            Ellipse head = new Ellipse(180, 180, 40, 40);
            head.draw();
        }
        if(num==1)
        {
            Line body= new Line(200, 220, 200, 280);
            body.draw();
        }
        if(num==3)
        {
            Line arm1= new Line(200,250, 220, 230);
            arm1.draw();
        }
        if(num==4)
        {
           Line arm2= new Line(200,250, 180, 230);
            arm2.draw();
        }
        if(num==5)
        {
            Line leg1= new Line(200,280, 180, 310);
            leg1.draw();
        }
        if(num==6)
        {
            Line leg2= new Line(200,280, 220, 310);
            leg2.draw();
        }
        
    }
    private void firstPage()
    {
        Rectangle cgenerated= new Rectangle(80, 250, 250,100);
        cgenerated.draw();
        Rectangle buddy= new Rectangle(390, 250, 250,100);
        buddy.draw();
    }
    public void onMouseClick(double xx, double yy)
    {
       
        if(80>xx && xx>330);
        {
            if(250<yy && yy<350)
            {
            System.out.print("it works");
            }
        }
        
    }
    public String toString()
    {

       return "the word is: "+ theword;
    }
}
