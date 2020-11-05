package com.example.my_application1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        Log.d("SecondActivity",data);

        Button buttont1=(Button)findViewById(R.id.button2);
        buttont1.setOnClickListener(new View.OnClickListener()        {
            //@Override
            /*
            public void onClick(View v)
            {
                finish();
            }*/

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });

        Button button3=(Button)findViewById(R.id.button5) ;
        button3.setOnClickListener(new View.OnClickListener()        {
            //@Override
            /*
            public void onClick(View v)
            {
                finish();
            }*/

            @Override
            public void onClick(View v) {
                String data="Hello second activity";
                Intent intent1=new Intent(MainActivity2.this,MainActivity3.class);
                intent1.putExtra("extra_data",data);
                startActivityForResult(intent1,1);

                Intent intent=new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                //startActivity(intent1);
            }
        });

        Button buttont2=(Button)findViewById(R.id.button4);
        buttont1.setOnClickListener(new View.OnClickListener()        {
            //@Override
            /*
            public void onClick(View v)
            {
                finish();
            }*/

            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("data_return","Hello firstActivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}