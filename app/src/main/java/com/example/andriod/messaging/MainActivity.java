package com.example.andriod.messaging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button rm,st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rm=(Button)findViewById(R.id.button);
        st=(Button)findViewById(R.id.button2);

        rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent read=new Intent(getApplicationContext(),readmesage.class);
                startActivity(read);
            }
        });

        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent show=new Intent(getApplicationContext(),showtimetable.class);
                startActivity(show);
            }
        });

    }
}
