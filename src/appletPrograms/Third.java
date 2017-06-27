//<Applet code="Third" width=300 height=300></Applet>
package appletPrograms;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Third extends Applet  {
	int x,y,result;
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	TextField tf1,tf2;
	public void init()
	{
		l1=new Label("First number ");
		l2=new Label("Second number ");
		l3=new Label("Welcome to Applet");
		b1=new Button("Add");
		b2=new Button("sub");
		b3=new Button("mul");
		b4=new Button("div");
		tf1=new TextField("0",20);
		tf2=new TextField("0",20);
		add(l1);add(tf1);add(l2);add(tf2);
		add(b1);add(b2);add(b3);add(b4);
		add(l3);
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				x=Integer.parseInt(tf1.getText());
				y=Integer.parseInt(tf2.getText());
				result=x+y;
				l3.setText("Result "+result);
				
			}
			
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x=Integer.parseInt(tf1.getText());
				y=Integer.parseInt(tf2.getText());
				result=x-y;
				l3.setText("Result "+result);
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x=Integer.parseInt(tf1.getText());
				y=Integer.parseInt(tf2.getText());
				result=x*y;
				l3.setText("Result "+result);
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x=Integer.parseInt(tf1.getText());
				y=Integer.parseInt(tf2.getText());
				result=x/y;
				l3.setText("Result "+result);
				
			}
		});
	}
	

}
