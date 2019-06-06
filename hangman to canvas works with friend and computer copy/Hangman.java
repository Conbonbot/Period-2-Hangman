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
    //private String theword;
    private ArrayList<Object> person;
    private JFrame frame;
    private Canvas canvas;
    private Rectangle cover;
    private Graphics g;
    private String[] nature;
    private String[] teacher;
    private String[] cs;
    private String word;
    
    public Hangman()
    {
        frame = new JFrame("My Drawing");
        canvas = new Canvas();
        canvas.setSize(500, 1800);
        frame.add(canvas);
        frame.pack();
//        cover= new Rectangle(0,0,1000,10000);
//        cover.draw();
        String c = "maac";
        PlayHangman(c);
        
    }
    public Hangman(String w)
    {
        word=w;
        if (word.equals("nature"))
        {
            EasyReader n= new EasyReader("nature.txt");
            nature=new String[4];
            //nature = new String[2396];
            for(int a=0; a<4; a++)
            {
                nature[a]= n.readLine();
            }
            int r= (int)(Math.random()*4);
            word=nature[r];
        }
        if (word.equals("teachers"))
        {
            EasyReader t= new EasyReader("teachers.txt");
            teacher=new String[5];
            //nature = new String[2396];
            for(int a=0; a<5; a++)
            {
                teacher[a]= t.readLine();
            }
            int rr= (int)(Math.random()*5);
            word=teacher[rr];
        }
        if (word.equals("comp sci"))
        {
            EasyReader c= new EasyReader("cs.txt");
            cs=new String[5];
            //nature = new String[2396];
            for(int a=0; a<5; a++)
            {
                cs[a]= c.readLine();
            }
            int rr= (int)(Math.random()*5);
            word=cs[rr];
        }
        
        
        frame = new JFrame("My Drawing");
        canvas = new Canvas();
        canvas.setSize(500, 1800);
        frame.add(canvas);
        frame.pack();
        //        cover= new Rectangle(0,0,1000,10000);
        //        cover.draw();
        System.out.println(word);
        for(int j=0; j<50; j++){
            System.out.println();
        }
        //System.out.println(word);
        PlayHangman(word);
        
    }
	private void PlayHangman(String a)
	{

        //theword=a;
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
                spacer=spacer + 20;
            }
        }
        boolean play= true;
        int index=0;
        read = new EasyReader();
        int countright=0;
        String temp="";
        int wrongX= -40;
        int wrongY= 520;
        int countwrong=0;
        while(play)
        {
            System.out.println("What is your guess?");
//            String guess= read.readLine();
//            index=theword.indexOf(guess.toUpperCase());
            char k= read.readChar();
            String guess= Character.toString(k);
            index=a.indexOf(guess);
//            String blue= guess;
            if (index==-1)
            {
                g.drawString(guess,wrongX+45,wrongY);
                wrongX=wrongX+30;
                guessWrong(countwrong);
                
                if(countwrong==6)
                {
                    System.out.println("You lost! The word was: "+ a);
                    play=false;
                }
                countwrong++;
            }
            
            while(index!=-1)
            {
                //System.out.print("work");
                //temp= a.substring(index);
                countright= countright+1;
                //System.out.println(countright);
                if(countright==a.length())
                {
                    System.out.println("You won! The word was: "+ a);
                    play=false;
                    
                }
                
                
                g.drawString(a.substring(index, index+1), under[index].getX(),under[index].getY()-5);
                index= a.indexOf(guess, index+1);
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
           g.drawLine(200,250, 180, 230);
        
        }
        if(num==5)
        {
            g.drawLine(200,280, 180, 310);
            
        }
        if(num==6)
        {
            g.drawLine(200,280, 220, 310);
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

       return "the word is: "+ word;
    }
}
