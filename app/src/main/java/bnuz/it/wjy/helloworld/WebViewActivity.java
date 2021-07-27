package bnuz.it.wjy.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private WebView mWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        mWvMain = findViewById(R.id.wv);
        //加载本地html
      //  mWvMain.loadUrl("file:///android_asset/Android.html");

        //加载网络URL
        //引进js支持
        mWvMain.getSettings().setJavaScriptEnabled(true);
        //在内部调用这个URL，不会弹出用其他软件打开URL的对话框
        mWvMain.setWebViewClient(new MyWebViewClient());
        //用m代替www
        mWvMain.setWebChromeClient(new MyWebChromeClient());
        mWvMain.loadUrl("https://m.baidu.com");


    }

    class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Log.d("WebView","onPageStard...");
            mWvMain.loadUrl("javascript:alter('Hello')");
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            Log.d("WebView","onPageFinished...");
            //页面加载完成弹出对话框
            //mWvMain.loadUrl("javascript:alter('Hello')");
            mWvMain.evaluateJavascript("javascript:alter('hello')",null);
        }
    }


    //点击返回键 ，回到上级界面，不退出Activity
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && mWvMain.canGoBack()){
            mWvMain.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }


    class MyWebChromeClient extends WebChromeClient{
        @Override
        //实现进度条
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }

        @Override
        //网页的标题
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            setTitle(title);
        }
    }
}