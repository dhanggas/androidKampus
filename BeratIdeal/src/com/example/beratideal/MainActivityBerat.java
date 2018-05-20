package com.example.beratideal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityBerat extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_berat);
        final EditText edtTinggi =(EditText) findViewById(R.id.edtTinggi);
        final EditText edtBerat =(EditText) findViewById(R.id.edtBerat);
        final Button btnCek = (Button) findViewById(R.id.btnCek);
        final TextView txtHasil = (TextView) findViewById(R.id.txtHasil);
        
        btnCek.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int nilaiTinggi = Integer.parseInt(edtTinggi.getText().toString());
				int nilaiBerat = Integer.parseInt(edtBerat.getText().toString());
				int hasil = nilaiTinggi- nilaiBerat;
				if (hasil == 110) {
					txtHasil.setText("Berat Ideal");
				} else {
					txtHasil.setText("Berat Tidak Ideal");
				}
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_berat, menu);
        return true;
    }
    
}
