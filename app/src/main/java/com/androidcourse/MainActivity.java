package com.androidcourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoFrameLayoutExample(View view) {
        Intent intent = new Intent(this, FrameLayoutActivity.class);
        startActivity(intent);
    }

    public void gotoLinearExample(View view) {
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        startActivity(intent);
    }

    public void gotoListViewExample(View view) {
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }

    public void gotoGridViewExample(View view) {
        Intent intent = new Intent(this, GridViewActivity.class);
        startActivity(intent);
    }

    public void gotoFragmentsExample(View view) {
        Intent intent = new Intent(this, FragmentsExampleActivity.class);
        startActivity(intent);
    }

    public void gotoCustomAdapterExample(View view) {
        Intent intent = new Intent(this, CustomAdapterExampleActivity.class);
        startActivity(intent);

    }
}
