import javax.swing.JFrame;

public class Window {
	
	JFrame frame = new JFrame();
	
	public Window() {
		
		System.out.println("window");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,700);
		frame.setLayout(null);
		frame.setVisible(true);
		
		Character charater = new Character();
		
	}
}
