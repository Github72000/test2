package com.example.my_application1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.my_application1.R;
import com.example.my_application1.fragment.AnotherRightFragment;
import com.example.my_application1.fragment.left_fragment;
import com.example.my_application1.fragment.right_fragment;

public class MainActivity6 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button button = (Button) findViewById(R.id.button_f1);
        //button.setOnClickListener(this);
        //replaceFragement(new right_fragment());
        left_fragment left_fragment1 = (left_fragment) getSupportFragmentManager()
                .findFragmentById(R.id.left_fragment);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_f1:
                replaceFragement(new AnotherRightFragment());
                break;
            default:
                break;
        }
    }

    private void replaceFragement(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right_layout , fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}