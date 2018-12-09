package googleadprojects.vlad.application3.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import googleadprojects.vlad.application3.R;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView = (WebView)findViewById(R.id.urlMovie);
        webView.loadUrl("https://www.imdb.com/title/tt0993846/");
    }
}
