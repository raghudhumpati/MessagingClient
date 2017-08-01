package com.example.andriod.messaging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by ANDRIOD on 7/19/2017.
 */

public class showtimetable extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_timetable);



        WebView wv=(WebView)findViewById(R.id.myweb);

        //enable javascript
        WebSettings webset=wv.getSettings();
        webset.setJavaScriptEnabled(true);

        //same client
        wv.setWebViewClient(new WebViewClient());

        wv.loadUrl("https://drive.google.com/drive/folders/0B3nBKvmXfo77QzNFaTBURGJmWkk");

    }
}
