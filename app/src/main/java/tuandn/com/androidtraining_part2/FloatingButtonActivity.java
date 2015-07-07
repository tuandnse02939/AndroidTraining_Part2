package tuandn.com.androidtraining_part2;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Anh Trung on 7/7/2015.
 */
public class FloatingButtonActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_button);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Yes", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "1000", Toast.LENGTH_LONG).show();
                            }
                        })
                        .show();
            }
        });
    }
}
