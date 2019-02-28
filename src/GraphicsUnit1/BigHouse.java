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

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
       bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      window.setColor(Color.red);
      window.fillPolygon(new int[] {150,400,650}, new int[] {200,50,200}, 3);
      window.setColor(Color.yellow);
      window.fillRect(250, 250, 75, 100);
      window.fillRect(475, 250, 75, 100);
      window.setColor(Color.black);
      window.fillRect(368, 460, 75, 100);
   }
}