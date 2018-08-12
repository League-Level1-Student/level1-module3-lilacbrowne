import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {

	public static void main(String[] args) {
		new NastySuprise().createUI();
	}

	JFrame frame = new JFrame();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JPanel panel = new JPanel();

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		button1.setText("Trick");
		button2.setText("Treat");
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		frame.setTitle("Trick or Treat!");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button1)) {
			showPictureFromTheInternet("https://i.ytimg.com/vi/Gw_xvtWJ6q0/hqdefault.jpg");
		} else if (buttonPressed.equals(button2)) {
			showPictureFromTheInternet(
					"https://cdn0.tnwcdn.com/wp-content/blogs.dir/1/files/2017/10/ghost-796x498.jpg");
		}
		// TODO Auto-generated method stub

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
