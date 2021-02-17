package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private EditText etn1;
    private EditText etn2;
    private TextView textResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn1 =(EditText) findViewById(R.id.etn1);
        etn2 =(EditText) findViewById(R.id.etn2);
        textResult= (TextView) findViewById(R.id.txtResult);
    }

    public void btnSum(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 + n2;
        textResult.setText(String.valueOf(sum));
    }

    public void btnSub(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sub = n1 - n2;
        textResult.setText(String.valueOf(sub));
    }

    public void btnMulty(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int multi= n1 * n2;
        textResult.setText(String.valueOf(multi));
    }

    public void btnDiv(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int div = n1 / n2;
        textResult.setText(String.valueOf(div));
    }
}