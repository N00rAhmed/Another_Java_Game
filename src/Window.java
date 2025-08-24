import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {
	
	JFrame frame = new JFrame();
		
	public Window() {
		
		System.out.println("window");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,700);
//		frame.setLayout(null);
		frame.setVisible(true);
		
		Character charater = new Character();
	}
	

	
}
