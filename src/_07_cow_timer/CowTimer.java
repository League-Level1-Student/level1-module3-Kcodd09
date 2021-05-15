package _07_cow_timer;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class CowTimer {

	/*
	 * 1. Make a constructor for the CowTimer class that initializes the minutes
	 * variable
	 */
	
	/* 4. Complete the main method of the CowTimerRunner class */

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow time set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for the number
		 * of minutes using Thread.sleep(int milliseconds).
		 */
		for (int i = minutes; i > 0; i--) {
			System.out.println(minutes);
			Thread.sleep(60000);
		}
		
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo sound.
		 * You can use the .wav file in the default package, or you can download one
		 * from freesound.org, then drag it into the default package.
		 */
			playSound("moo.wav");
		
	}

	public void playSound(final String file) {
		String fileName = "src/_07_cow_timer/" + file;
		// Note: use .wav files
		new Thread(new Runnable() {
			public void run() {
				try {
					Clip clip = AudioSystem.getClip();
					AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName));
					clip.open(inputStream);
					clip.start();
				} catch (Exception e) {
					System.out.println("play sound error: " + e.getMessage() + " for " + fileName);
				}

			}
		}).start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
