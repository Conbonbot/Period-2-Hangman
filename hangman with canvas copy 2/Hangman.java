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
import java.awt.Graphics;
import javax.swing.JFrame;

public class Hangman extends Canvas
{
    
    private boolean state;
    Player win;
    private String[] b;
    private EasyReader read;
    private String line;
    private String theword;
    private ArrayList<Object> person;
    private JFrame frame;
    private Canvas canvas;
    private Rectangle cover;
    private Graphics g;
    
    public Hangman()
    {
        frame = new JFrame("My Drawing");
        canvas = new Canvas();
        canvas.setSize(500, 600);
        frame.add(canvas);
        frame.pack();
//        cover= new Rectangle(0,0,1000,10000);
//        cover.draw();
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
                g.drawLine(spacer, 500, spacer+10, 500);
                under[count]= new Line(spacer, 500, spacer+50, 500);
                spacer= spacer+ 30;
                count++;
            }
            if(a.substring(b-1,b).equals(" "))
            {
                count++;
                spacer=spacer + 220;
            }
        }
        boolean play= true;
        int index=0;
        read = new EasyReader();
        String temp="";
        int wrongX= -40;
        int wrongY= 490;
        int countwrong=0;
        while(play)
        {
            System.out.println("What is your guess?");
            String guess= read.readLine();
            //String guess= ""+ g;
            index=a.indexOf(guess.toUpperCase());
            
            if (index==-1)
            {
                g.drawString(guess,wrongX+40,wrongY);
                wrongX=wrongX+30;
                guessWrong(countwrong);
                countwrong++;
                
            }
            
            while(index!=-1)
            {
                //temp= a.substring(index);
                g.drawString(a.substring(index, index+1), under[index].getX()+20,under[index].getY()-80);
                index= a.indexOf(guess.toUpperCase(), index+1);
                }
            }
    }
    
    private void drawHang()
    {
        frame.add(canvas);

        frame.setVisible(true);
        
         g = canvas.getGraphics();
        //g.setColor(new Color(255, 0, 0));
        //g.drawString("Hello", 200, 200);
        g.drawLine(50, 350, 150, 350);
        g.drawLine(100, 350, 100, 150);
        g.drawLine(100, 150, 200, 150);

        g.drawLine(200, 150, 200,180);
    }
    private void guessWrong(int num)
    {
        if(num==0)
        {
            g.drawOval(180, 180, 40,40);
        }
        if(num==1)
        {
            g.drawLine(200, 220, 200, 280);
            
        }
        if(num==3)
        {
            g.drawLine(200,250, 220, 230);
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
