import java.awt.Color;
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
		
		if (e.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			frame.getContentPane().setBackground(new Color(0,255,0));
		} else  {
			System.out.println("Incorrect");
			frame.getContentPane().setBackground(Color.red);
	}}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you typed: " + e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
currentLetter = generateRandomLetter();
label.setText(""+ currentLetter);
	
	}
}
