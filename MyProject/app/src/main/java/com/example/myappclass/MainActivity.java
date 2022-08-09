package com.example.myappclass;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



// find by view id
        TextView a = findViewById(R.id.Calculator);
        Button add =  findViewById(R.id.add);
        Button div =  findViewById(R.id.div);
        Button mult =  findViewById(R.id.mult);
        Button min =  findViewById(R.id.min);
        TextView total = findViewById(R.id.total);
        EditText num1 = findViewById(R.id.number1);
        EditText num2 = findViewById(R.id.number2);


// set on click
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int a= Integer.parseInt(num1.getText().toString());
                    int b= Integer.parseInt(num2.getText().toString());
                    int x=a+b;
                    total.setText(String.valueOf(x));
                            Toast.makeText(MainActivity.this, "result is" + x, Toast.LENGTH_LONG).show();                    System.out.println(x);
                }
            });

            min.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int a = Integer.parseInt(num1.getText().toString());
                    int b =Integer.parseInt(num2.getText().toString());
                    int x= a-b ;
                    total.setText(String.valueOf(x));
                    Toast.makeText(MainActivity.this, "result is" + x, Toast.LENGTH_LONG).show();

                }
            });

            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int a = Integer.parseInt(num1.getText().toString());
                    int b =Integer.parseInt(num2.getText().toString());
                    int x =a/b;
                    Toast.makeText(MainActivity.this, "result is" + x, Toast.LENGTH_LONG).show();
                    total.setText(String.valueOf(x));
                }
            });

            mult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int a = Integer.parseInt(num1.getText().toString());
                    int b =Integer.parseInt(num2.getText().toString());
                    int x = a*b;
                    Toast.makeText(MainActivity.this, "result is" + x, Toast.LENGTH_LONG).show();
                    total.setText(String.valueOf(x));
                }
            });

        }
    }
