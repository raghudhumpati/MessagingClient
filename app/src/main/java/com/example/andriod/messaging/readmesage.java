package com.example.andriod.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

/**
 * Created by ANDRIOD on 7/19/2017.
 */

public class readmesage extends AppCompatActivity {

Button b;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_message);

        b=(Button)findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNotification();

            }
        });

    }

    public void addNotification()
    {
        NotificationCompat.Builder builder=new NotificationCompat.Builder(readmesage.this);
        builder.setSmallIcon(R.drawable.icon);
        builder.setContentTitle("YOUR MESSAGE");
        builder.setContentText("Updated TimeTables are placed. Please check them....");

        Intent n=new Intent(this,readmesage.class);
        PendingIntent pi=PendingIntent.getActivity(this,0,n,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);

        NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0,builder.build());

    }
}
