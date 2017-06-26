//<Applet code="Hello" height=300 width=300></Applet>
package appletPrograms;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Hello extends Applet implements MouseListener {
	int x,y;
	public void init()
	{
		x=y=100;
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello", x, y);
	}
	@Override
	public void mouseClicked(MouseEvent me) {
		x=me.getX();
		y=me.getY();
		repaint();
		
	}
	@Override
	public void mouseEntered(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}
	
	

}
