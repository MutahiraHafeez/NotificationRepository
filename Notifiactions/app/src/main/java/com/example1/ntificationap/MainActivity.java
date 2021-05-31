package com.example1.ntificationap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
   Button notifyBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notifyBtn = findViewById(R.id.Notifybtn);

        notifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Notifiaction code goes here

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this,"My Notification");
                builder.setContentTitle("New Notification");
                builder.setContentText("Hello from Mutahira, Doing practice with Notification in Android Studio");
            }
        });
    }




}