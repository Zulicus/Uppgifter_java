package ui_base;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
	private JFrame frame;

	public UserInterface() {

	}

	@Override
	public void run() {
		frame = new JFrame("A hello");

		frame.setPreferredSize(new Dimension(700, 500));

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		createComponent(frame.getContentPane());

		frame.pack();

		frame.setVisible(true);

	}

	private void createComponent(Container container) {

		GridLayout layout = new GridLayout(1, 3);
		container.setLayout(layout);
		JTextArea textAreaLeft = new JTextArea();
		JTextArea textAreaRight= new JTextArea();
		JButton copyButton = new JButton("Copy");
		container.add(textAreaLeft);		
		container.add(copyButton);
		container.add(textAreaRight);

		MessageListner click = new MessageListner(textAreaLeft,textAreaRight);
		copyButton.addActionListener(click);

	}

	public JFrame getFrame() {
		return frame;
	}
}
