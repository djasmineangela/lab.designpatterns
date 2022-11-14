package com.bootcamp.lab.designpatterns.adapter;

import com.bootcamp.lab.designpatterns.adapter.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing Mp3 file");
		}

		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType);
		}

		else {
			System.out.println(audioType + " format is not supported");
		}
	}

}
