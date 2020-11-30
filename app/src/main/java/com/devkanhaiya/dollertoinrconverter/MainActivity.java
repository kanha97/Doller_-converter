package com.devkanhaiya.dollertoinrconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void btnClicked(View v){
        EditText editText=findViewById(R.id.edittext);
        TextView textView=findViewById(R.id.inr);

        String givenValue=editText.getText().toString();

        Double givenValueD=Double.parseDouble(givenValue);

        Double inrValue=givenValueD*74.16;


        textView.setText("INR  "+ inrValue);



    }
}