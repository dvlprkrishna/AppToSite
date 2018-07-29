package in.dvlpr.apptosite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = (WebView)findViewById(R.id.webView);
        WebSettings myWebSetting = myWebView.getSettings();
        myWebSetting.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://sahukrishna.github.io/creativeresume");

    }
}
