import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements KeyListener, ActionListener {

	public static void main(String[] args) {
		new Calculator().createUI();
		JOptionPane.showMessageDialog(null,
				"Enter a number in each box, then click the button for which operation you want to do!");
	}

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField text1 = new JTextField(15);
	JTextField text2 = new JTextField(15);

	private void createUI() {
		frame.setVisible(true);
		frame.setTitle("Simple Calculator");
		frame.add(panel);
		panel.add(text1);
		panel.add(text2);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		div.setText("div");
		mul.setText("mul");
		sub.setText("sub");
		add.setText("add");
		add.addActionListener(this);
		mul.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		frame.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		text1.getText();
		text2.getText();
		String a = text1.getText();
		int num1 = Integer.parseInt(a);
		String b = text2.getText();
		int num2 = Integer.parseInt(b);
	}

}
