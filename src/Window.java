import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {
	
	JFrame frame = new JFrame();
		
	public Window() {
		
//		String imagePath = "C:\\\\Users\\\\Noor\\\\Desktop\\\\PROGRAMMING\\\\Epic_Game\\\\Cool_Java_Game\\\\src\\\\mario.png";
//	
//        frame = new JFrame("Image Display");
//        var icon = new ImageIcon(imagePath);
//
//        if (icon.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
//            System.out.println("Image failed to load.");
//            return;
//        }
//
//        Image img = icon.getImage();
//        Image resizedImage = img.getScaledInstance(600, 600, java.awt.Image.SCALE_SMOOTH);
//        icon = new ImageIcon(resizedImage);
//
//        var label = new JLabel(icon);
//        frame.add(label);

		
		
		
		System.out.println("window");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,700);
//		frame.setLayout(null);
		frame.setVisible(true);
		
//		Character charater = new Character();
		
	}
	
//    public void show() {
//        frame.setVisible(true);  // Makes the frame visible
//    }
//    public static void main(String[] args) {
//        new Window();
//    }

	
}
