import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	public static void main(String[] args) {
		ChuckleClicker chuckles = new ChuckleClicker();
		chuckles.makeButtons();
	}

	JButton punchline = new JButton();
	JButton joke = new JButton();

	void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("ChuckleClicker");
		JPanel panel = new JPanel();
		joke.setText("joke");
		joke.addActionListener(this);
		JButton punchline = new JButton();
		punchline.setText("punchline");
		punchline.addActionListener(this);
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
JButton buttonPressed = (JButton) e.getSource(); 
if (buttonPressed.equals(joke)) {
	JOptionPane.showMessageDialog(null, "Why is an island like the letter T?");
} else if (buttonPressed.equals(punchline)) {
	JOptionPane.showMessageDialog(null, "They're both in the middle of water!");
} 
	}
}