package bnuz.it.wjy.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class EditTextActivity extends AppCompatActivity {


    private EditText mEtUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        mEtUserName = (EditText)findViewById(R.id.et_1);
        mEtUserName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edittext",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }



}