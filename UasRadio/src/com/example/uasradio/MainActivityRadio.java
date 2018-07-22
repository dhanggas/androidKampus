package com.example.uasradio;

import android.os.Bundle;
import android.renderscript.RSDriverException;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivityRadio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_radio);
        
        RadioGroup rdoGroup = (RadioGroup)findViewById(R.id.radioGroup1);
        final RadioButton rdo1 = (RadioButton)findViewById(R.id.radio0);
        RadioButton rdo2 = (RadioButton)findViewById(R.id.radio1);
        final EditText edtJumlah = (EditText)findViewById(R.id.edtJumlah);
        Button btnHitung = (Button)findViewById(R.id.btnHitung);
        
//        rdoGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
//			
//			@Override
//			public void onCheckedChanged(RadioGroup arg0, int arg1) {
//				// TODO Auto-generated method stub
//				
//				int valHasil, valJumlah;
//				valJumlah = Integer.parseInt(edtJumlah.getText().toString());
//				if (rdo1.isChecked()) {
//					valHasil = valJumlah* 50000;
//					Toast.makeText(getBaseContext(),"Total Bayar :"+ valHasil, Toast.LENGTH_LONG).show();
//				} else {
//					valHasil = valJumlah* 70000;
//					Toast.makeText(getBaseContext(),"Total Bayar :"+ valHasil, Toast.LENGTH_LONG).show();
//				}
//				
//			}
//		});
        btnHitung.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int valHasil, valJumlah;
				valJumlah = Integer.parseInt(edtJumlah.getText().toString());
				if (rdo1.isChecked()) {
					valHasil = valJumlah* 50000;
					Toast.makeText(getBaseContext(),"Total Bayar :"+ valHasil, Toast.LENGTH_LONG).show();
				} else {
					valHasil = valJumlah* 70000;
					Toast.makeText(getBaseContext(),"Total Bayar :"+ valHasil, Toast.LENGTH_LONG).show();
				}
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_radio, menu);
        return true;
    }
    
}
