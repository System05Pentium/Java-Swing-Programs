import javax.swing.*;
public class buttlabe
{
	public static void main(String args[])
	{
		JFrame f= new JFrame();
		JButton b=new JButton("button box");
	      b.setBounds(100,150,100,50);
		    JLabel l=new JLabel("First Label");
	         l.setBounds(100,200,100,90);
	         f.add(l);
	         f.add(b);
	         f.setSize(400,400);
			 f.setLayout(null);
			f.setVisible(true);
	}
}
		