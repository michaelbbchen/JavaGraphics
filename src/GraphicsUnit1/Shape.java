package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x; yPos = y; width = wid; height = ht; color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.setColor(color.darker());
      window.fillOval(xPos, yPos, width, height);
      window.setColor(color);
      window.fillPolygon(new int[] {xPos + width / 2, xPos + width, xPos + width / 2, xPos}, new int[] {yPos, yPos + height / 2,yPos + height, yPos + height / 2}, 4);
      window.setColor(color.darker());
      window.drawLine(xPos, yPos, xPos - width / 2, yPos - height / 2);
      window.drawLine(xPos + width / 2, yPos, xPos + width / 2, yPos - height / 2);
      window.drawLine(xPos + width, yPos, xPos +  3 * width / 2, yPos - height / 2);
      window.drawLine(xPos + width, yPos + height / 2, xPos + 3*width / 2, yPos + height / 2);
      window.drawLine(xPos + width, yPos + height, xPos + 3*width / 2, yPos + 3*height / 2);
      window.drawLine(xPos + width / 2, yPos + height , xPos + width / 2, yPos + 3 *height / 2);
      window.drawLine(xPos, yPos + height, xPos - width / 2, yPos +  3*height / 2);
      window.drawLine(xPos, yPos + height / 2, xPos - width / 2, yPos + height / 2);
//draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}