package com.example.raggingcomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btn;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.antiragging.in/");

        btn = findViewById(R.id.button7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            finish();
        }
    }
}