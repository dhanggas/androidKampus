package com.example.hitungzakat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityZakat extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_zakat);
        final EditText panjang = (EditText) findViewById(R.id.edtHarta);
        final EditText lebar = (EditText) findViewById(R.id.edtEmas);
        final TextView txtHasil =(TextView) findViewById(R.id.txtHasil);
        final Button btnHitung = (Button) findViewById(R.id.brnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double valHarta , valEmas, valHasil ,valNisab , valZakat;
				valHarta = Integer.parseInt(panjang.getText().toString());
				valEmas = Integer.parseInt(lebar.getText().toString());
				valNisab = 85 * valEmas;
				
				if (valHarta < valNisab) {
					txtHasil.setText("Belum wajib Zakat");
				} else {
					valZakat =(2.5/100) * valHarta;
					txtHasil.setText("Jumlah zakat"+valZakat);
					

				}
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_zakat, menu);
        return true;
    }
    
}
