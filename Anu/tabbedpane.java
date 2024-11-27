import javax.swing.*;
public class tabbedpane
{
	tabbedpane()
	{
		JFrame f=new JFrame();
		JTextArea area=new JTextArea("new words");
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		p1.add(area);
		p2.add(area);
		p3.add(area);
		
		JTabbedPane tp=new JTabbedPane();
		tp.setBounds(100,100,300,300);
		tp.add("main",p1);
		tp.add("list",p2);
		tp.add("help",p3);
		f.add(tp);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new tabbedpane();
}}
		