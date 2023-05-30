package com.example.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.txt_num1);
        et2=findViewById(R.id.txt_num2);
        tv=findViewById(R.id.lbl_resultado);
    }
    public void suma(View View){
        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());
        int res=num1+num2;
        tv.setText("la Suma es: " + res);
    }
    public void resta(View View){
        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());
        int res=num1-num2;
        tv.setText("la Resta es: " + res);
    }
    public void mult(View View){
        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());
        int res=num1*num2;
        tv.setText("la Multiplicación es: " + res);
    }
    public void div(View View){
        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());
        int res=num1/num2;
        tv.setText("la División es: " + res);
    }
}