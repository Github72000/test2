package com.example.my_application1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttont1=(Button)findViewById(R.id.button1);
        buttont1.setOnClickListener(new View.OnClickListener()        {
            //@Override
            /*
            public void onClick(View v)
            {
                finish();
            }*/

            @Override
            public void onClick(View v) {
                String data="Hello second activity";
                /*
                Intent intent1=new Intent(MainActivity.this,MainActivity2.class);
                intent1.putExtra("extra_data",data);
                startActivityForResult(intent1,1);*/
                Intent intent2=MainActivity2.newIntent(MainActivity.this,"CHG","HG");
                startActivity(intent2);


                Intent intent=new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                //startActivity(intent1);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
       // return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.add_item:
                Toast.makeText(this,"you clicked add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you clicked Remove",Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }


}