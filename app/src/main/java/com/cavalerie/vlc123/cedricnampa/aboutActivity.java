package com.cavalerie.vlc123.cedricnampa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutActivity extends AppCompatActivity {

    private WebView webviewAbout;
    String url = "https://andela.com/alc/";

    @Override
    public void onBackPressed() {

        if (webviewAbout.canGoBack())
            webviewAbout.goBack();
        else
            super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webviewAbout = (WebView) findViewById(R.id.webviewAbout);
        webviewAbout.setWebViewClient(new WebViewClient());
        webviewAbout.loadUrl(url);
    }
}
