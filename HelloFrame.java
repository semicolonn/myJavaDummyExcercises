package operatorsWithJava;
					
import javax.swing.*;
					
	public class HelloFrame extends JFrame{
			
		
	public static void main (String[] args) {
					
					new HelloFrame();
					
					}
	
	public HelloFrame(){
		
		this.setSize(250, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Hello World!");
		this.setVisible(true);
		JLabel label1 = new JLabel();
		label1.setText("Hello, World!");
		add(label1);
		//label1.setText("Hi from Label");
		//add(label1);
		//JButton b= new JButton("I am a Button!");
		//add(b);
		
	}
					
			}
	
	