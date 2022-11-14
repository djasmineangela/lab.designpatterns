package com.bootcamp.lab.designpatterns.adapter;

import com.bootcamp.lab.designpatterns.adapter.interfaces.AdvancedMediaPlayer;
import com.bootcamp.lab.designpatterns.adapter.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer{
	
	private AdvancedMediaPlayer advancedMediaPlayer;
	public static final String VLC = "vlc";
    public static final String MP4 = "mp4";
	
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase(VLC)) {
			advancedMediaPlayer = new VLCPlayer();
        } else if (audioType.equalsIgnoreCase(MP4)) {
        	advancedMediaPlayer = new Mp4Player();
        }
	}

	@Override
	public void play(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVLC();
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
				advancedMediaPlayer.playMp4();
	      }
	}

}
