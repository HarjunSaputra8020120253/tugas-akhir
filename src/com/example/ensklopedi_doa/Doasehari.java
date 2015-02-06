package com.example.ensklopedi_doa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Doasehari extends Activity {
	Button btn_tidur, btn_baguntidur, btn_maumakan, btn_sdhmakan, btn_maupergi,
			btn_kemasjid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_doasehari);

		btn_tidur = (Button) findViewById(R.id.button1);
		btn_baguntidur = (Button) findViewById(R.id.button2);
		btn_maumakan = (Button) findViewById(R.id.button3);
		btn_sdhmakan = (Button) findViewById(R.id.button4);
		btn_maupergi = (Button) findViewById(R.id.button5);
		btn_kemasjid = (Button) findViewById(R.id.button7);

		btn_tidur.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasehari.this, Doatampil_tidur.class);

				startActivity(i);
			}
		});

		btn_baguntidur.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasehari.this, Doabanguntidur.class);

				startActivity(i);
			}
		});

		btn_maumakan.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasehari.this, Doamakan.class);

				startActivity(i);
			}
		});

		btn_sdhmakan.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasehari.this, Doasudahmakan.class);

				startActivity(i);
			}
		});

		btn_maupergi.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasehari.this, Doabepergian.class);

				startActivity(i);
			}
		});

		btn_kemasjid.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasehari.this, Doakemasjid.class);

				startActivity(i);
			}
		});

	}
}
