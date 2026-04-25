package com.example.webtoapk;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); WebView webView = new WebView(this);
setContentView(webView);

WebView webView = new WebView(this);
setContentView(webView);

WebSettings settings = webView.getSettings();
settings.setJavaScriptEnabled(true);
settings.setDomStorageEnabled(true);

// 👇 YE ADD KARNA MOST IMPORTANT
webView.setWebViewClient(new WebViewClient());

// 👇 TEST ke liye pehle ye use karo
webView.loadUrl("https://google.com");

        setContentView(webView);
    }
}
