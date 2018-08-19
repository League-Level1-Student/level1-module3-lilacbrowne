import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	public static void main(String[] args) {
		new WhackAMole().createUI();
		JOptionPane.showMessageDialog(null, "Welcome to Whack-a-Mole. Here are the rules: if you whack a mole, your mole score increases by 1. If you miss, your miss score increases by 1. In order to win, you need 10 mole whacks before you miss 5 moles. Happy whacking!");
	}

	int molenumber;
	int score;
	int molesWhacked;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		frame.setVisible(true);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.add(panel);
		drawButtons();
		frame.setSize(250, 335);
	}

	public void drawButtons() {
		Random ran = new Random();
		molenumber = ran.nextInt(27);
		for (int i = 0; i < 27; i++) {
			if (i == molenumber) {
				JButton mole = new JButton("mole!");
				panel.add(mole);
				mole.addActionListener(this);
			} else {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonpressed = (JButton) e.getSource();
		if (buttonpressed.getText().equals("")) {
			speak("That's not the mole.");
			score += 1;
			System.out.println("And now your miss score is " + score);
			frame.dispose();
			panel.removeAll();
			createUI();
			if (score > 4) {
				speak("You lose!"); 
				frame.dispose();
				panel.removeAll();
			}
				
			}  else {
				speak("You got the mole!");
				playSound("yay.wav"); 
				molesWhacked += 1;
				System.out.println("Your mole score is now "+ molesWhacked);
				frame.dispose();
				panel.removeAll();
				createUI(); 
				if (molesWhacked > 9) {
					speak("You win!"); 
					
				}

		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

}
