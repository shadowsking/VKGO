package com.example.king.vkgo.mvp.View.Authorization;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.king.vkgo.API.NetworkManager;
import com.example.king.vkgo.Constants;
import com.example.king.vkgo.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AuthorizationActivity extends AppCompatActivity implements AuthorizationView{
    @BindView(R.id.webViewId)
    WebView webView;

    Constants constants = new Constants();

    private String access_token;
    private String user_id;
    private String URL = constants.auth_URL +"?client_id="+constants.clientID + "&scope=" + constants.scope + "&redirect_uri="+constants.redirect_URL + "&response_type=token";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);
        ButterKnife.bind(this);
        webView = new WebView(this);
        setContentView(webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(URL);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(final WebView view, String url) {
                Log.d("LOL",url);
                if(url.startsWith(constants.redirect_URL)){
                    access_token = url.split("#")[1].split("&")[0].split("=")[1];
                    user_id = url.split("#")[1].split("&")[2].split("=")[1];
                    Log.d("token", access_token);
                    Log.d("user_id", user_id);
                    hideWebView();
                    constants.saveInSharedPreferences("ACCESS_TOKEN",access_token, view.getContext());
                    constants.saveInSharedPreferences("USER_ID", user_id, view.getContext());
                }else {
                    Log.d("codeLOL", "NO_ACCESS_TOKEN");
                }
            }
        });
        finish();
    }

    @Override
    public void addData() {

    }

    public void hideWebView(){
        webView.setVisibility(View.GONE);
    }

}
