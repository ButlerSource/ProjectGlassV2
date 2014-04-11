package com.example.projectglassv1;



import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;

public class AudioFeed {
    
	public void getAudio() {
    	AudioManager audio = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
    	 audio.playSoundEffect(Sounds.TAP);
    	 
    	 /*
    	    mMediaPlayer = new MediaPlayer(this, R.raw.yourfile);
			mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
			mMediaPlayer.prepare();
			mMediaPlayer.start();
    	  */
    	 
    }
}