package com.example.latihan1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityLatihan1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_latihan1);
        
        final EditText edtNilai = (EditText) findViewById(R.id.edtNilai);
        final Button btnOk = (Button) findViewById(R.id.btnOk);
        final TextView txtNilai =(TextView) findViewById(R.id.txtNilai);
        
        btnOk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int nilaiValue = Integer.parseInt(edtNilai.getText().toString());
				if (nilaiValue > 85) {
					txtNilai.setText("LULUS");
				} else {
					txtNilai.setText("Tidak LULUS");
				}
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_latihan1, menu);
        return true;
    }
    
}
