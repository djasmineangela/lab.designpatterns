package com.bootcamp.lab.designpatterns.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3");
		audioPlayer.play("mp4");
		audioPlayer.play("vlc");
		audioPlayer.play("wav");

	}

}
