package gr.aueb.dmst.nereids.graphicalInterface;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/** 
 * Contains all the game music
 * 
 * Initializes the .wav files
 * that are found on the res/sounds package
 * and also has certain methods to control them
 * throughout the game. 
 */

public class Sound {

	Clip clip;
	URL[] soundURL = new URL[12];

	public Sound() {
		soundURL[0] = getClass().getResource("/sounds/gameplay.wav");
		soundURL[1] = getClass().getResource("/sounds/conflict.wav");
		soundURL[2] = getClass().getResource("/sounds/rocks.wav");
		soundURL[3] = getClass().getResource("/sounds/seaanimals.wav");
		soundURL[4] = getClass().getResource("/sounds/storm.wav");
		soundURL[5] = getClass().getResource("/sounds/swell.wav");
		soundURL[6] = getClass().getResource("/sounds/wind.wav");
		soundURL[7] = getClass().getResource("/sounds/ohno.wav");
		soundURL[8] = getClass().getResource("/sounds/wingame.wav");
		soundURL[9] = getClass().getResource("/sounds/main1.wav");
		soundURL[10] = getClass().getResource("/sounds/pirate.wav");
		soundURL[11] = getClass().getResource("/sounds/losegame.wav");
	}

	public void setFile(int i) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
			clip = AudioSystem.getClip();
			clip.open(ais);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void play() {
		clip.start();
	}

	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public void stop() {
		clip.stop();
	}
}