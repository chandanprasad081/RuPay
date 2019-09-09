package com.example.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectMain extends AppCompatActivity {
    TextView back,next;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_main);
        back=findViewById(R.id.back);
        next=findViewById(R.id.next);
        //b1=findViewById(R.id.SignIn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectMain.this,Forgotpassword.class);
                startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectMain.this,EmailVarification.class);
                startActivity(intent);
            }
        });
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(SelectMain.this,Dashboard.class);
//                startActivity(intent);
//            }
//        });
    }
}
