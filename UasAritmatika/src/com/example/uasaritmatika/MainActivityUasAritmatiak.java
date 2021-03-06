package com.example.uasaritmatika;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityUasAritmatiak extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_uas_aritmatiak);
        final EditText edtJumlah = (EditText)findViewById(R.id.edtJumlah);
        final EditText edtHarga = (EditText)findViewById(R.id.edtHarga);
        Button btnHasil = (Button)findViewById(R.id.button1);
        final TextView txtHasil = (TextView) findViewById(R.id.txtHasil);
        
        btnHasil.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Double valJumlah, valHarga, valHasil;
				valJumlah = Double.parseDouble(edtJumlah.getText().toString());
				valHarga = Double.parseDouble(edtHarga.getText().toString());
				valHasil = valJumlah*valHarga;
				
				if (valHasil > 500000) {
					txtHasil.setText("Total : "+valHasil+" Dapat Bonus");
				} else {
					txtHasil.setText("Total : "+valHasil+ " Tidak Dapat Bonus");
				}
				
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_uas_aritmatiak, menu);
        return true;
    }
    
}
