package mainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//Here is where button presses is handled
public class Listner implements ActionListener {
	public ArrayList<String> sounds = new ArrayList<String>();
	public PlaySound run;

	public Listner() {
		run = new PlaySound();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		addSound();
		run.play(sounds.get(Integer.valueOf(e.getActionCommand())));
	}

//This imports the sounds to the Sound Arraylist 
	private void addSound() {
		// In order to not create an arraylist that get's bigger every time a button is
		// pressed it is cleared first
		sounds.clear();
		sounds.add("Sound/pop.wav");
		sounds.add("Sound/2000-years-later.wav");
		sounds.add("Sound/angels.wav");
		sounds.add("Sound/benny-hill.wav");
		sounds.add("Sound/clapping.wav");
		sounds.add("Sound/cry.wav");
		sounds.add("Sound/curb-your-enthusiasm.wav");
		sounds.add("Sound/denied.wav");
		sounds.add("Sound/E.wav");
		sounds.add("Sound/fail.wav");
		sounds.add("Sound/fuck-you.wav");
		sounds.add("Sound/goofy-yell.wav");
		sounds.add("Sound/haha.wav");
		sounds.add("Sound/hallelujah.wav");
		sounds.add("Sound/harry-potter.wav");
		sounds.add("Sound/hellomf.wav");
		sounds.add("Sound/its-high-noon.wav");
		sounds.add("Sound/katyPerry.wav");
		sounds.add("Sound/lightsaber.wav");
		sounds.add("Sound/lol.wav");
		sounds.add("Sound/nice.wav");
		sounds.add("Sound/nononono.wav");
		sounds.add("Sound/oh_my.wav");
		sounds.add("Sound/pentakill.wav");
		sounds.add("Sound/run.wav");
		sounds.add("Sound/sans.wav");
		sounds.add("Sound/sitcom-laughing.wav");
		sounds.add("Sound/stupid.wav");
		sounds.add("Sound/succ.wav");
		sounds.add("Sound/suffer.wav");
		sounds.add("Sound/THICC.wav");
		sounds.add("Sound/we-are-number-one.wav");
		sounds.add("Sound/wtf.wav");
		sounds.add("Sound/yeet.wav");
		sounds.add("Sound/you-must-die.wav");
		sounds.add("Sound/flap-jack-scream.wav");
	}
}
