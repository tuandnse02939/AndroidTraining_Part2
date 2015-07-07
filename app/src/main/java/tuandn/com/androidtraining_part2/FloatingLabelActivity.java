package tuandn.com.androidtraining_part2;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Anh Trung on 7/6/2015.
 */
public class FloatingLabelActivity extends MainActivity{

    private EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_label);

        init();
    }

    private void init() {
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (username.getText().length() < 6 | username.getText().length() > 20) {
                    username.setError("Username must be 6-20 characters");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (password.getText().length() < 6 | password.getText().length() > 20) {
                    password.setError("Password must be 6-20 characters");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
