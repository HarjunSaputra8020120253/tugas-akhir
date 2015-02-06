package com.example.ensklopedi_doa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btn_hari, btn_sholat, btn_dzikir, btn_pendek, btn_tentang;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		btn_hari = (Button) findViewById(R.id.button1);
		btn_sholat = (Button) findViewById(R.id.button2);
		btn_dzikir = (Button) findViewById(R.id.button3);
		btn_pendek = (Button) findViewById(R.id.button4);
		btn_tentang = (Button) findViewById(R.id.button5);

		btn_hari.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Doasehari.class);

				startActivity(i);

			}
		});
		btn_sholat.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Doasholat.class);

				startActivity(i);

			}
		});
		btn_dzikir.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						Doatampil_dzikir.class);
				startActivity(i);
			}
		});
		btn_pendek.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Doasuratpendek.class);

				startActivity(i);

			}
		});
		btn_tentang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,
						Tentangensiklopedi.class);

				startActivity(i);

			}
		});

	}
}
