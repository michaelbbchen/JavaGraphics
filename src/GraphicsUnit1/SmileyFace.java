package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

		//add more code here
      //Draw eyes
      window.setColor(Color.BLACK);
      window.fillOval(310, 200, 30, 30);
      window.fillOval(480 ,200,30,30);
      //Draw mouth
      window.setColor(Color.red);
      window.fillArc(360, 400, 100, 60, 180, 180);
      //Draw nose
      window.setColor(Color.BLUE);
      window.fillOval(390, 270, 40, 60);
   }
}