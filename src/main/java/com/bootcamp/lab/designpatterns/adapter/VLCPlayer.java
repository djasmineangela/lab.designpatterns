package com.bootcamp.lab.designpatterns.adapter;

import com.bootcamp.lab.designpatterns.adapter.interfaces.AdvancedMediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC() {
		System.out.println("Playing in VLC");
	}

	@Override
	public void playMp4() {
		System.out.println("Playing in Mp4");
	}

}
