package com.example.ensklopedi_doa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Doasholat extends Activity {
	Button btn_qunut, btn_sujud;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_doasholat);

		btn_qunut = (Button) findViewById(R.id.button1);
		btn_sujud = (Button) findViewById(R.id.button2);

		btn_qunut.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasholat.this, Doaqunut.class);

				startActivity(i);
			}
		});

		btn_sujud.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasholat.this, Doasujud.class);

				startActivity(i);
			}
		});
	}
}
