import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Hook// implements GameState //implements InputKeyControl//, InputControl
{
	private ArrayList<Rectangle> limbs;
	private int i = 0;
	
	private Ellipse head;
	private Rectangle spine;
	
	private Rectangle lArm;
	private Rectangle rArm;
	
	private Rectangle lLeg;
	private Rectangle rLeg;
	private Rectangle bg;
	
	public Hook()
	{
		limbs = new ArrayList<>();
		
		bg = new Rectangle(0,0,2000,2000);
		bg.setColor(Color.WHITE);
		bg.fill();
		
		Rectangle pole  = new Rectangle(70,100,20,400);
		Rectangle top   = new Rectangle(70,100,150,20);
		Rectangle noose = new Rectangle(200,120,20,20);
		Rectangle base  = new Rectangle(40,500,140,20);
	
		// pole.setColor(Color.BLUE);
		// top.fill();
		// noose.setColor(Color.BLUE);
		// base.fill();
		base.fill();
		pole.fill();
		top.fill();
		noose.fill();
		
		head  = new Ellipse(170,135,80,80);
		spine = new Rectangle(200,170,20,175);
		lArm  = new Rectangle(150,245,50,20);
		rArm  = new Rectangle(220,245,50,20);		
		lLeg  = new Rectangle(180,325,20,100);
		rLeg  = new Rectangle(220,325,20,100);
		
		
		limbs.add(spine);
		limbs.add(lArm );
		limbs.add(rArm );
		limbs.add(lLeg );
		limbs.add(rLeg );
		


		
		// head.fill();
		// spine.fill();
		// lArm.fill();
		// rArm.fill();
		// lLeg.fill();
		// rLeg.fill();
	}
	
	public void addBodyPart()
	{	
		if(i==0)
		{
			head.fill();
			i++;
		}
		
		else //(i > 0) //&& i-1 < limbs.size())
		{
			limbs.get(i-1).fill();
			i++;
		}
	}
	
	public void updateTheme(Color a)
	{
		bg.setColor(a);
	}
	
}