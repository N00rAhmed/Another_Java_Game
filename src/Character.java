import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Character extends JFrame{
	

	public Character() {
		
		System.out.println("Character Class");

		String imagePath = "C:\\\\Users\\\\Noor\\\\Desktop\\\\PROGRAMMING\\\\Epic_Game\\\\Cool_Java_Game\\\\src\\\\mario.png";

		var icon = new ImageIcon(imagePath);

        if (icon.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
            System.out.println("Image failed to load.");
            return;
        }
        
//        figure out controlls and then rendering an image maybe to make it easier have a look at the tutorials you used before from that guy making
//        a java game

        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(600, 600, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(resizedImage);

        var label = new JLabel(icon);

	}
}


