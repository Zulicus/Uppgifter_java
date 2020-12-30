package mainPackage;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//Here is where the actual sound is handled and where any error in the sound files will be handled
public class PlaySound {
	public Clip clip;

	public void play(String file) {
		try {
			clip.stop();
			clip.close();
		} catch (Exception exc) {
			System.out.println(exc);
		}
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File(file)));
			clip.start();
		} catch (Exception exc) {
			System.out.println("The specified audio file is not supported.");
		}
	}
}
