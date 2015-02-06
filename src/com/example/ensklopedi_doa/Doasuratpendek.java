package com.example.ensklopedi_doa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Doasuratpendek extends Activity {
	Button btn_annas, btn_alikhlas, btn_alfatihah;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_doasuratpendek);

		btn_annas = (Button) findViewById(R.id.button1);
		btn_alikhlas = (Button) findViewById(R.id.button2);
		btn_alfatihah = (Button) findViewById(R.id.button3);

		btn_annas.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasuratpendek.this, Doasurat_annas.class);

				startActivity(i);
			}
		});

		btn_alikhlas.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasuratpendek.this,
						Doasurat_alikhlas.class);

				startActivity(i);
			}
		});

		btn_annas.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Doasuratpendek.this,
						Doasurat_alfatihah.class);

				startActivity(i);
			}
		});
	}

}
