package com.example.uasradioradio;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivityRadioRadio extends Activity {
	int valHasil, valTujuan, valJumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_radio_radio);
        RadioGroup rdoGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
        final RadioButton rdo1 = (RadioButton)findViewById(R.id.radio1);
        final RadioButton rdo2 = (RadioButton)findViewById(R.id.radio2);
      
        
        RadioGroup rdoGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        final RadioButton rdoJumlah1 = (RadioButton)findViewById(R.id.radioJumlah1);
        final RadioButton rdoJumlah2 = (RadioButton)findViewById(R.id.rdoJumlah2);
        RadioButton rdoJumlah3 = (RadioButton)findViewById(R.id.rdoJumlah3);
        
        Button btnHitung = (Button)findViewById(R.id.btnHiutung);
        
        rdoGroup1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				if (rdo1.isChecked()) {
					valTujuan= 50000;
				} else {
					valTujuan= 70000;
				}
				
			}
		});
        
        rdoGroup2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				if (rdoJumlah1.isChecked()) {
					valJumlah= 1;
				} else if(rdoJumlah2.isChecked()){
					valJumlah= 2;
				}else{
					valJumlah= 3;
				}
			}
		});
        
        btnHitung.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valHasil = valTujuan*valJumlah;
				Toast.makeText(getBaseContext(), "Total Bayar : "+valHasil , Toast.LENGTH_LONG).show();
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_radio_radio, menu);
        return true;
    }
    
}
