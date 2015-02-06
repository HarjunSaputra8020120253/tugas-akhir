package com.example.ensklopedi_doa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class Doasujud extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_doasujud);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.doasujud, menu);
		return true;
	}

}
