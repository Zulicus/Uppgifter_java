package mainPackage;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.util.ArrayList;

public class UserInterface implements Runnable {
	private JFrame frame;

	public UserInterface() {
	}

	@Override
	public void run() {
		// This sets the dimensions of the Board window
		frame = new JFrame("SoundBoard");
		frame.setPreferredSize(new Dimension(1000, 500));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}

//This implements the buttons functionality
	private void createComponents(Container container) {
		GridLayout layout = new GridLayout(6, 6);
		container.setLayout(layout);
		ArrayList<JButton> buttonList = createButtons();
		Listner click = new Listner();
		for (int i = 0; i < buttonList.size(); i++) {
			buttonList.get(i).addActionListener(click);
			container.add(buttonList.get(i));
		}
	}

//This creates all the buttons and labels them
	private ArrayList<JButton> createButtons() {
		ArrayList<JButton> buttonList = new ArrayList<JButton>();
		// String array that contains all the label names
		String[] buttonText = { "Pop", "2000 Years Later", "Angles Singing", "Benny Hill Theme", "Applause", "Baby Cry",
				"Curb Your Enthusiasm", "Denied", "E", "Fail", "F You", "Goofy Yell", "Ha-Ha", "Hallelujah",
				"Harry Potter", "Hello MF", "It's High Noon", "They Ask You How You Are", "Lightsaber", "Lol", "Nice",
				"NoNoNo Cat", "Oh My", "Pentakill", "Run", "Sans", "Sitcom Laugh", "U Stoopid", "Succ",
				"Why Are We Here", "Damn Boi He THICC", "We Are Number One", "WTF", "Yeet", "You Must Die", "Scream" };
		// Creates each button one by one and adds them to a JButton Arraylist
		for (int i = 0; i < buttonText.length; i++) {
			JButton button = new JButton(buttonText[i]);
			button.setMargin(new Insets(1, 1, 1, 1));
			buttonList.add(button);
			buttonList.get(i).setActionCommand(String.valueOf(i));
		}
		return buttonList;
	}

	public JFrame getFrame() {
		return frame;
	}

}