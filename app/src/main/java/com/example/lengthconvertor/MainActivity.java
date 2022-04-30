package com.example.lengthconvertor;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed_txt;
    TextView txt_vw;
    Button btn;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch S1,S2,S3,S4;
    int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        txt_vw = findViewById(R.id.out);
        ed_txt = (EditText) findViewById(R.id.number);
        S1 = findViewById(R.id.cm_1);
        S2 = findViewById(R.id.m_1);
        S3 = findViewById(R.id.cm_2);
        S4 = findViewById(R.id.m_2);
    }

    @SuppressLint("SetTextI18n")
    public void convert(View view)
    {
        number = Integer.parseInt(ed_txt.getText().toString());
        if(S1.isChecked() && S2.isChecked())
            txt_vw.setText("Kindly Select One Unit!");
        else if(S3.isChecked() && S4.isChecked())
            txt_vw.setText("Kindly Select One Unit!");
        if(S1.isChecked())
        {
            if(S3.isChecked())
                txt_vw.setText(String.valueOf(number));
            else if(S4.isChecked())
            {
                double no = (double)number/100;
                txt_vw.setText(String.valueOf(no));
            }
        }
        else if(S2.isChecked())
        {
            if(S3.isChecked())
            {
                double no = (double)number*100;
                txt_vw.setText(String.valueOf(no));
            }
            else if(S4.isChecked())
                txt_vw.setText(String.valueOf(number));
        }
    }
}