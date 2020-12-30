package swing;

import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();// creating instance of JFrame
		JLabel l = new JLabel("You pressed the button");
		JButton b = new JButton("click");// creating instance of JButton
		b.setBounds(130, 100, 80, 20);// x axis, y axis, width, height
		l.setBounds(50, 50, 100, 30);
		f.add(b);// adding button in JFrame
		f.setSize(400, 300);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.add(l);
			}
		});
	}
}
