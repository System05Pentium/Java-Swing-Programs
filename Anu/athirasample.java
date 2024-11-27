import javax.swing.*; 
import java.awt.event.*; 

public class athirasample extends JFrame implements ActionListener 
{ 
	JLabel a; 
	JButton bt; 
	athirasample() 

	{ 
		//super("Button Example"); 
		setSize(400,400); 
		a= new JLabel("Label 1"); 
		a.setBounds(50,60,100,30); 
		bt=new JButton("S"); 
		bt.setBounds(150,70,100,30); 
		add(a); 
		add(bt); 
		bt.addActionListener(this); 
		setLayout(null); 
		setVisible(true); 
	} 

		public void actionPerformed(ActionEvent ae) 
		{ 
			if (ae.getSource()==bt) 
			{ 
				System.out.println("clicked"+bt.getText()); 
				a.setText("Click Button"+bt.getText()); 
			} 
		} 

	public static void main(String args[]) 
	{ 
		new athirasample(); 
	} 
} 