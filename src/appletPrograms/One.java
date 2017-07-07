package appletPrograms;
import java.awt.*;
import java.awt.event.*;
class One extends Frame
{
	Label l1,l2,l3;
	Button b1;
	TextField tf1,tf2;
	One()
	{
		setSize(500,500);
		setLocation(200,200);
		setTitle("Login");
		setVisible(true);
		l1=new Label("Enter your id ");
		l2=new Label("Enter password  ");
		l3=new Label("Login Details");
		b1=new Button("Login");
		tf1=new TextField(10);
		tf2=new TextField(10);
		tf2.setEchoChar('*');
		setLayout(new GridLayout(3,2));//3 rows and 2 columns 
		//add windowListener must be defined before the add method then only it will run
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);//is the method for exite.
			}
		});
		add(l1);add(tf1);
		add(l2);add(tf2);
		add(b1);add(l3);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String s1=tf1.getText();
				String s2=tf2.getText();
				if(s1.equals("Vishal")&&s2.equals("123@cosine"))
				{
					l3.setText("Valid user ");
				} 
				else
				{
					l3.setText("Invalid user ");
				}
			}
		});
		
	}
	public static void main(String args[])
	{
		One o=new One();
		
	}
}
//running properly