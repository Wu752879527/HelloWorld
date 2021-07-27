package bnuz.it.wjy.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnButton;
    private Button mBtnEdittext;
    private Button mBtnRadiobutton;
    private Button mBtnCheckbox;
    private Button mBtnImageview;
    private Button mBtnWebview;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnButton = (Button) findViewById(R.id.button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });

        mBtnEdittext = (Button) findViewById(R.id.btn_edittext);
        mBtnEdittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });

        mBtnRadiobutton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnRadiobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                startActivity(intent);
            }
        });

        mBtnCheckbox = (Button) findViewById(R.id.btn_checkbox);
        mBtnCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        mBtnImageview = (Button) findViewById(R.id.btn_imageview);
        mBtnImageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnWebview = (Button)findViewById(R.id.btn_webview);
        mBtnWebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnToast = (Button)findViewById(R.id.btn_toast);
        mBtnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ToastActivity.class);
                startActivity(intent);
            }
        });

        mBtnDialog = (Button)findViewById(R.id.btn_dialog);
        mBtnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlertDialogActivity.class);
                startActivity(intent);
            }
        });

        mBtnProgress = (Button)findViewById(R.id.btn_progress);
        mBtnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProgressActivity.class);
                startActivity(intent);
            }
        });
    }
}