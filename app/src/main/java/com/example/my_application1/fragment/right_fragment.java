package com.example.my_application1.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.my_application1.MainActivity;
import com.example.my_application1.MainActivity6;
import com.example.my_application1.R;

public class right_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.right_fragment,container,false);
        MainActivity6 activity6 = (MainActivity6) getActivity();
        //activity6.getSupportFragmentManager();
        return view;

        
    }

}
