package com.example.my_application1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        Button buttont1=(Button)findViewById(R.id.button3);
        buttont1.setOnClickListener(new View.OnClickListener()        {
            //@Override
            /*
            public void onClick(View v)
            {
                finish();
            }*/

            @Override
            public void onClick(View v) {
                /*
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);*/
                finish();
            }
        });

    }
}
