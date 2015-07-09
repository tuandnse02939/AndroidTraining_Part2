package Fragments;


import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import tuandn.com.androidtraining_part2.R;

/**
 * Created by Anh Trung on 7/9/2015.
 */
public class FloatingLabelFragment extends Fragment {
    private static final String TAG = "MyActivity";
    private EditText username,password;
    TextInputLayout layoutUsername, layoutPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_floating_label, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        layoutUsername = (TextInputLayout) getView().findViewById(R.id.layout_username);
        layoutPassword = (TextInputLayout) getView().findViewById(R.id.layout_password);

        username = (EditText) getView().findViewById(R.id.username);
        password = (EditText) getView().findViewById(R.id.password);

        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (username.getText().length() < 6 | username.getText().length() > 20) {
                    layoutUsername.setError("Username's length must be 6-20 characters");
                }
                else{
                    layoutUsername.setError(null);
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
                    layoutPassword.setError("Password's length must be 6-20 characters");
                }
                else{
                    layoutPassword.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        super.onActivityCreated(savedInstanceState);
    }

}
