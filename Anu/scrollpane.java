import javax.swing.*;
public class scrollpane
{
public static void main(String args[])
{
	JFrame f=new JFrame("j button");
	JScrollPane b=new JScrollPane();
	b.setBounds(50,50,100,100);
	f.add(b);
	f.setSize(300,400);
	f.setVisible(true);
	f.setLayout(null);
}}