package com.example.projectglassv1;

import java.util.Timer;
import java.util.TimerTask;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	private Handler handler = new Handler();
	
	private TextView xAView;
	private TextView yAView;
	private TextView zAView;
	private SensorModule mModule;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 mModule = new SensorModule(this);
		
		 xAView = (TextView) findViewById(R.id.xAcceleration);
		 yAView = (TextView) findViewById(R.id.yAcceleration);
		 zAView = (TextView) findViewById(R.id.zAcceleration);

		 handler.postDelayed(runnable, 1000);


		

		
		
	}

	
	private Runnable runnable = new Runnable() {
		   @Override
		   public void run() { 
			   xAView.setText("X Acceleration: " + mModule.getAccelerationX());
			   yAView.setText("Y Acceleration: " + mModule.getAccelerationY());
			   zAView.setText("Z Acceleration: " + mModule.getAccelerationZ());
		      handler.postDelayed(this, 1000);
		   }
		};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	  @Override
	  protected void onResume() {
	    super.onResume();

	  }


}
