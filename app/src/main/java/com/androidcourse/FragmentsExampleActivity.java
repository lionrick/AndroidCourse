package com.androidcourse;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.androidcourse.fragments.FirstFragment;

public class FragmentsExampleActivity extends AppCompatActivity implements FirstFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_example);

        initViews();
    }

    private void initViews() {

        FirstFragment firstFragment = FirstFragment.newInstance();


        FragmentManager fragmentManager =  getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,firstFragment ).commit();
    }

    @Override
    public void onFragmentInteraction() {
        Toast.makeText(this,"Hi, i am an activity", Toast.LENGTH_SHORT ).show();
    }
}
