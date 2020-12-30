package ui_base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class MessageListner implements ActionListener {

	private JTextArea origin;
	private JTextArea destination;

	public MessageListner(JTextArea textAreaLeft, JTextArea textAreaRight) {
		this.origin = textAreaLeft;
		this.destination = textAreaRight;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello");
		this.destination.setText(this.origin.getText());
	}

}
