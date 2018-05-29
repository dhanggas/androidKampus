package com.example.aritmatika;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityAritmatika extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_aritmatika);
        final EditText panjang = (EditText) findViewById(R.id.edtPanjang);
        final EditText lebar = (EditText) findViewById(R.id.edtLebar);
        final TextView txtHasil =(TextView) findViewById(R.id.txtHasil);
        final Button btnHitung = (Button) findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int valpanjang,vallebar,valhasil;
				valpanjang = Integer.parseInt(panjang.getText().toString());
				vallebar = Integer.parseInt(lebar.getText().toString());
				valhasil =valpanjang * vallebar;
				txtHasil.setText("Luas : "+ valhasil);
				
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_aritmatika, menu);
        return true;
    }
    
}
