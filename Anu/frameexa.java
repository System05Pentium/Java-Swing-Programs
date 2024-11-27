import javax.swing.*;
public class frameexa
{
	public static void main(String args[])
	{
		JFrame f= new JFrame("welcome");
		JButton b=new JButton("click");
		b.setBounds(50,50,50,20);
		f.add(b);
		f.setSize(400,300);
		f.setVisible(true);
		f.setLayout(null);
	}
}
		