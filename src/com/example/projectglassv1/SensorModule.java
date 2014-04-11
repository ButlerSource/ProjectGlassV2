package com.example.projectglassv1;

import android.app.Activity;
import android.content.Context;
import android.hardware.SensorManager;

public class SensorModule {

	SensorManager mSensorManager;
	Accelerometer mAccelerometer;
	AudioFeed mAudioFeed;
	
	
	public SensorModule(Activity mActivity) { //passes in a context
		
		mSensorManager = (SensorManager) mActivity.getSystemService(Context.SENSOR_SERVICE); 
		mAccelerometer = new Accelerometer(mSensorManager);
		mAudioFeed = new AudioFeed();
	}

	
	public String getAccelerationX()
	{
		return Float.toString(mAccelerometer.getAccelerationX());
	}
	
	public String getAccelerationY()
	{
		return Float.toString(mAccelerometer.getAccelerationY());
	}
	
	public String getAccelerationZ()
	{
		return Float.toString(mAccelerometer.getAccelerationZ());
	}
	
	public void getAudioFeed()
	{
		mAudioFeed.getAudio();
	}
}
