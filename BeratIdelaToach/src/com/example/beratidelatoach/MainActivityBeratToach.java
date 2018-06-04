package com.example.beratidelatoach;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityBeratToach extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_berat_toach);
        final EditText edtTinggi = (EditText) findViewById(R.id.edtTinggi);
        final EditText edtBerat = (EditText) findViewById(R.id.ectBerat);
        final Button btnHitung = (Button) findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Integer valtinggi,valBerat , valHasil;
				valtinggi = Integer.parseInt(edtTinggi.getText().toString());
				valBerat = Integer.parseInt(edtBerat.getText().toString());
				valHasil=valtinggi-110;
				if (valHasil == valBerat) {
					Toast.makeText(getBaseContext(), "ideal", Toast.LENGTH_LONG).show();
				} else if(valHasil < valBerat){
					Toast.makeText(getBaseContext(), "Gemuk", Toast.LENGTH_LONG).show();
				}else{
					Toast.makeText(getBaseContext(), "Kurus", Toast.LENGTH_LONG).show();
				}
				
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_berat_toach, menu);
        return true;
    }
    
}
