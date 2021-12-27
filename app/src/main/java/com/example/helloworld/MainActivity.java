package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_clickme;
    Boolean val;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val = Boolean.FALSE;

        btn_clickme = (Button) findViewById(R.id.btn_ClickMe);

        btn_clickme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (val){
                    btn_clickme.setText("My Button!");
                    val = !val;
                }
                else{
                    btn_clickme.setText("Your Button!");
                    val = !val;
                }
            }
        });

    }

}