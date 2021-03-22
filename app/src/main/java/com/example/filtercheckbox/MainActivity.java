package com.example.filtercheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox Android, Java, Php;
    Button Submit;
    TextView Output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Android = findViewById(R.id.cb_android);
        Java = findViewById(R.id.cb_java);
        Php = findViewById(R.id.cb_php);
        Submit = findViewById(R.id.bt_submit);
        Output = findViewById(R.id.output);

        Android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Android.isChecked()){
                    Android.setTextColor(getResources().getColor(R.color.Accent));
                }
                else {
                    Android.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Java.isChecked()){
                    Java.setTextColor(getResources().getColor(R.color.Accent));
                }
                else {
                    Java.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        Php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Php.isChecked()){
                    Php.setTextColor(getResources().getColor(R.color.Accent));
                }
                else {
                    Php.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s ="";
                if (Android.isChecked()){
                    s += "\n Android";
                }

                if (Java.isChecked()){
                    s += "\n Java";
                }

                if (Php.isChecked()){
                    s += "\n Php";
                }

                Output.setText(s);
            }
        });
    }
}