package com.example.radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivityRadio extends Activity {
	RadioButton pil1;
	RadioButton pil2;
	RadioButton pil3;
	EditText edtBerat;
	Button btnHitung;
	int harga= 0;
	Double berat;
	Double totHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_radio);
        RadioGroup pilGroupe = (RadioGroup)findViewById(R.id.radioGroup1);
        pil1= (RadioButton)findViewById(R.id.radio0);
        pil2= (RadioButton)findViewById(R.id.radio1);
        pil3= (RadioButton)findViewById(R.id.radio2);
        edtBerat =(EditText)findViewById(R.id.edtBerat);
        btnHitung= (Button)findViewById(R.id.btnHitung);
        
        pilGroupe.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				if (pil1.isChecked()) {
					harga=10000;
				} else if (pil2.isChecked()) {
					harga=20000;
				}else{
					harga=30000;
				}
				
			}
		});
        btnHitung.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				berat = Double.parseDouble(edtBerat.getText().toString());
				totHarga = berat * harga;
				Toast.makeText(getBaseContext(), "Total biaya"+totHarga, Toast.LENGTH_LONG).show();
				
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
