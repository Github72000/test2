package com.example.my_application1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends BaseActivity {

    public static Intent newIntent(Context context,String yourname,String myname){
        Intent intent = new Intent(context,MainActivity2.class);
        intent.putExtra("extra_data",yourname);
        //intent.putExtra("param2",myname);
        //context.startActivity(intent);
        return intent;
    }


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

             ActivityCollector.finishAll();

            }
        });

        Button button30 = (Button)findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ActivityCollector.finishAll();
                android.os.Process.killProcess(android.os.Process.myPid());
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


        Button button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent31 = new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(intent31);
            }
        });

        Button button21= (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21 = new Intent(MainActivity2.this,MainActivity6.class);
                startActivity(intent21);
            }
        });
    }
}