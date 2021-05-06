package com.example.finalprojectpromo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webActivity extends AppCompatActivity {

    WebView mWebView;

    @Override
    public void onBackPressed() {
        if(mWebView.canGoBack()){
            mWebView.goBack();
        }
        else{
        super.onBackPressed();
    }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        mWebView = findViewById(R.id.myWeb);

        Intent intent = getIntent();
        String webSite=intent.getStringExtra("links");

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl(webSite);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("javascript:(function(){\n" +
                "  document.getElementById('txtUsername-label').value='MyUsername';\n" +
                "  document.getElementById('password').value='MyPassword';\n" +
                "  document.forms.loginForma.submit.click();\n" +
                "})();");

    }
}