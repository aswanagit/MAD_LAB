package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener {
    String category[] = {"MCA", "ESC", "CSE", "EEE"};
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String>arr=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,category);
        arr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(arr);
        spin.setOnItemSelectedListener(this);
    }

    @Override

    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

        Toast.makeText(this, "Selected:" + spin.getSelectedItem(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}



