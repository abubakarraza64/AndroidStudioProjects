package com.example.brevia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity5 extends AppCompatActivity {
FloatingActionButton fool2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        fool2 = findViewById(R.id.fool);
        fool2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
                startActivity(intent);
                Toast.makeText(MainActivity5.this, "Now you are Moving hom  e page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}