//<Applet code="HelloUsingAdapter" height=300 width=300></Applet>
package appletPrograms;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class HelloUsingAdapter extends Applet {
	int x,y;
	public void init() 
	{
		x=y=300;
		ObjClass obj=new ObjClass();
		addMouseListener(obj);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Hello", x, y);
		
	}
	class ObjClass extends MouseAdapter
	{
		public void mouseClicked(MouseEvent me)
		{
			x=me.getX();
			y=me.getY();
			repaint();
		}
	}

}
