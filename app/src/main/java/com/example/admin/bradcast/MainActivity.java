package com.example.admin.bradcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.broadcast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent();
                in.setAction("com.mario.action.CUSTOM_BROADCAST");
                sendStickyBroadcast(in);
                Toast.makeText(MainActivity.this, "Custom sticky sent", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
