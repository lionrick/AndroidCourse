package com.androidcourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btFrameLayout = new Button(this);
        btFrameLayout.setText("LinearLayout");
        RelativeLayout.LayoutParams layoutParams =
                (RelativeLayout.LayoutParams)btFrameLayout.getLayoutParams();
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);


    }
}
