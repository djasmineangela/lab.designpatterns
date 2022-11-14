package com.bootcamp.lab.designpatterns.adapter;

import com.bootcamp.lab.designpatterns.adapter.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC() {
		System.out.println("Playing VLC file");

	}

	@Override
	public void playMp4() {
		System.out.println("Playing Mp4 file");

	}

}
