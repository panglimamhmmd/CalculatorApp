package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inp1;
    private EditText inp2;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inp1 = (EditText) findViewById(R.id.inp1);
        inp2 = (EditText) findViewById(R.id.inp2);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    public void add(View view) {
        int n1 = Integer.parseInt(inp1.getText().toString());
        int n2 = Integer.parseInt(inp2.getText().toString());
        int sum1 = n1 + n2;
        tvResult.setText(String.valueOf(sum1));
    }

    public void multiply(View view) {
        int n1 = Integer.parseInt(inp1.getText().toString());
        int n2 = Integer.parseInt(inp2.getText().toString());
        int sub1= n1 * n2;
        tvResult.setText(String.valueOf(sub1));

    }

    public void devide(View view) {
        int n1 = Integer.parseInt(inp1.getText().toString());
        int n2 = Integer.parseInt(inp2.getText().toString());
        double dev1 = n1 / n2;
        tvResult.setText(String.valueOf(dev1));
    }

    public void subtract(View view) {
        int n1 = Integer.parseInt(inp1.getText().toString());
        int n2 = Integer.parseInt(inp2.getText().toString());
        int subt1 = n1 - n2;
        tvResult.setText(String.valueOf(subt1));
    }

    public void remove(View view) {
        inp1.setText("");
        inp2.setText("");
        tvResult.setText("0");
        inp1.requestFocus();
    }
}