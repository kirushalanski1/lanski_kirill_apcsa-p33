//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable
{
	private Ball ball;

	public BallTestTwo()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//instantiate a new Ball
		ball = new Ball();

		//TODO: NEED TO TEST ALL THIS STUFF
		
		//test the Ball thoroughly
		System.out.println(ball);
		System.out.println(ball.equals(ball));

		//test all constructors
		Ball one = new Ball(50, 100);
		System.out.println(one);
		
		Ball two = new Ball(200, 350, 20, 20);
		System.out.println(two);
		
		Ball three = new Ball(400, 300, 15, 15, Color.YELLOW);
		System.out.println(three);
		
		Ball four = new Ball(150, 400, 5, 5, Color.BLUE, 4, 5);
		System.out.println(four);

		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);

		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(19);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}