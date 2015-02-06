package com.example.ensklopedi_doa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Doadzikir extends Activity {
	Button btn_dzikir;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_doadzikir);

		btn_dzikir = (Button) findViewById(R.id.button3);

		btn_dzikir.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						Doatampil_dzikir.class);
				startActivity(i);
			}
		});

	}
}
