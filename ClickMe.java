package operatorsWithJava;
//example from book: java-all-in-one-for-dummies-4th-edition-doug-lowe page590 (614 of 963)
import javax.swing.*;
import java.awt.event.*;

	public class ClickMe extends JFrame implements ActionListener{
		
		public static void main(String[] args) {
			new ClickMe();
		}
		private JButton button1;
		public ClickMe() {
			this.setSize(300, 150);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("I'm Listening");
			
			JPanel panel1= new JPanel();
			button1= new JButton("Click Me!");
			button1.addActionListener(this);
			panel1.add(button1);
			this.add(panel1);
			this.setVisible(true);
		}
		private int clickCount=0;
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()== button1) {
				clickCount++;
				if(clickCount==1)
					button1.setText("I have been clicked!");
				else
					button1.setText("I have been clicked" + clickCount +"Times!");
			}
		}
	}