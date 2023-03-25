package com.esraa.hp.dateandtimepickerdialogs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView=new WebView(this);

        setContentView(webView);

        webView.loadUrl("https://www.google.com/");
    }
}
