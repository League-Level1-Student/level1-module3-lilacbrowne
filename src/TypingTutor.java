import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {

	public static void main(String[] args) {
		new TypingTutor().createUI();
	}

	JFrame frame = new JFrame();
	JLabel label = new JLabel(); 
	char currentLetter;

	private void createUI() {
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.pack();
		currentLetter = generateRandomLetter();
		frame.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you typed: " + currentLetter);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	
	}
}
