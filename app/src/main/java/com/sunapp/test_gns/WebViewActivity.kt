package com.sunapp.test_gns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebViewActivity : AppCompatActivity() {

    var webView : WebView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        webView = findViewById(R.id.web_view)

        val url = intent.getStringExtra("url")

        webView?.settings?.javaScriptEnabled
        webView?.loadUrl(url)
    }
}
