import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	public static void main(String[] args) {
		new SlotMachine().createUI();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();

	private void createUI() {
		frame.setVisible(true);
		frame.setTitle("Slot Machine");
		frame.add(panel);
		panel.add(button);
		button.setText("SPIN");
		button.addActionListener(this);
		frame.pack();

	}

	public void spin() {
		panel.removeAll();
		panel.add(button); 
		boolean matching = true; 
		int last = 0; 
		for (int i = 0; i < 3; i++) {
			Random ran = new Random();
			int r = ran.nextInt(3) + 1;
			System.out.println(r);
			if (i == 0) {
				last = r;  
			}
			if (r != last) {
				matching = false;
				last = r;
			} 
			if (r == 1) {
				JLabel cherry = loadImageFromComputer("cherry.jpg");
				panel.add(cherry);
			} else if (r == 2) {
				JLabel orange = loadImageFromComputer("orange.jpg");
				panel.add(orange);
			} else if (r == 3) {
				JLabel lime = loadImageFromComputer("lime.jpg");
				panel.add(lime);
			}
			
		}
		if (matching == true) {
			System.out.println("You win!");
			playSound("yay.wav");
		}
frame.pack();
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonpressed = (JButton) e.getSource();
		if (buttonpressed.equals(button)) {
			spin();

		}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

}
