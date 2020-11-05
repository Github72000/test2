package com.example.my_application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    private List<Fruit> fruitList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity4.this,R.layout.fruit_item,fruitList);
/*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        MainActivity3.this,android.R.layout.simple_expandable_list_item_1,data);*/
        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity4.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });


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