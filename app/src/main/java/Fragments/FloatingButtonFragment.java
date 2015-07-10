package Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;

import tuandn.com.androidtraining_part2.R;

/**
 * Created by Anh Trung on 7/9/2015.
 */
public class FloatingButtonFragment extends Fragment {
    private static final String TAG = "MyActivity";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_floating_button, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        FloatingActionButton fab = (FloatingActionButton) getView().findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Yes", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getActivity(), "Hello World!", Toast.LENGTH_LONG).show();
                            }
                        })
                        .show();
            }
        });

        final CheckBox checkBox = (CheckBox) getView().findViewById(R.id.checkbox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "OK", Snackbar.LENGTH_LONG)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(checkBox.isChecked()) {
                                    checkBox.setChecked(false);
                                }
                                else{
                                    checkBox.setChecked(true);
                                }
                            }
                        })
                        .show();
            }
        });

        super.onActivityCreated(savedInstanceState);
    }

}
