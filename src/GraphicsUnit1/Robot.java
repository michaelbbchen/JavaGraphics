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

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      upperBody(window);
      head(window);
      lowerBody(window);
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.GRAY);

      window.fillRect(300, 100, 80, 100);
      window.setColor(Color.YELLOW);
      window.fillOval(315, 120, 10, 20);
      window.fillOval(355, 120, 10, 20);
      window.setColor(Color.DARK_GRAY);
      window.fillPolygon(new int[] {335, 340, 345}, new int[] {100, 40, 100}, 3);
      //window.fillRect(290, 170, 100, 40);
      window.fillPolygon(new int[] {295, 305, 315, 365, 375, 385, 385, 295}, new int[] {160, 160, 180, 180, 160, 160, 205, 205}, 8);
      window.setColor(Color.RED);
      window.fillOval(325, 25, 30, 30);
		//add more code here
				
   }

   public void upperBody( Graphics window )
   {

		//add more code here
       window.setColor(Color.GRAY);
       window.fillRect(250, 190, 180, 200);
       window.drawLine(250, 190, 190, 340);
       window.drawLine(430, 190, 490, 340);
       window.setColor(Color.RED);
       window.fillOval(350, 330, 15, 15);
       window.setColor(Color.BLUE);
       window.fillOval(375, 330, 15, 15);
       window.fillOval(400, 330, 15, 15);
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.GRAY);
       window.fillRect(250, 390, 60, 120);
       window.fillRect(370, 390, 60, 120);
       window.setColor(Color.DARK_GRAY);
       window.fillRect(245, 380, 70, 20);
       window.fillRect(365, 380, 70, 20);
		//add more code here

   }
}