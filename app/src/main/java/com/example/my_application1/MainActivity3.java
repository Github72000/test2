package com.example.my_application1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    private List<Fruit> fruitList= new ArrayList<>();

    private String[] data = {"apple","banana","banana","banana","banana","banana",
            "banana","banana","banana","banana","banana","banana","orange"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity3.this,R.layout.fruit_item,fruitList);
/*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        MainActivity3.this,android.R.layout.simple_expandable_list_item_1,data);*/
        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity3.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });




/*
        Button buttont1=(Button)findViewById(R.id.button3);
        buttont1.setOnClickListener(new View.OnClickListener()        {


            @Override
            public void onClick(View v) {

                finish();
            }
        });

 */


    }

    private void initFruits() {
    for(int i=0;i<2;i++)
    {
        Fruit apple = new Fruit("apple",R.drawable.ic_launcher_background);
        fruitList.add(apple);
        Fruit banana = new Fruit("banana",R.drawable.ic_launcher_foreground);
        fruitList.add(banana);
    }
    }


}

