//<Applet code="Fourth" height=400 width=400></Applet>
package appletPrograms;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Fourth extends Applet implements ActionListener{
	int x,y,result;
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	TextField tf1,tf2;
	public void init()
	{
		l1=new Label("First number ");
		l2=new Label("Second number ");
		l3=new Label("Welocome to Applet");
		tf1=new TextField("0",20);
		tf2=new TextField("0",20);
		b1=new Button("Add");
		b2=new Button("Sub");
		b3=new Button("Mul");
		b4=new Button("Div");
		add(l1);add(tf1);add(l2);add(tf2);add(b1);
		add(b2);add(b3);add(b4);add(l3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		x=Integer.parseInt(tf1.getText());
		y=Integer.parseInt(tf2.getText());
		
		
		if(arg0.getSource()==b1)
		{
			
			result=x+y;
			
		}
		else if(arg0.getSource()==b2)
		{
			
			result=x-y;
			
		}
		else if(arg0.getSource()==b3)
		{
			result=x*y;
		
		}
		else
		{
			result=x/y;
		}
		l3.setText("Result "+result);
		
		
	}
	

}
