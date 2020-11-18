package com.example.my_application1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.my_application1.BaseActivity;
import com.example.my_application1.Fruit;
import com.example.my_application1.R;
import com.example.my_application1.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity4 extends BaseActivity {

    private List<Fruit> fruitList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerAdapter adapter = new RecyclerAdapter(fruitList);
        recyclerView.setAdapter(adapter);
      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(
      //  MainActivity3.this,android.R.layout.simple_expandable_list_item_1,data);
        /*
        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity4.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
*/

    }

    private void initFruits() {
        for(int i=0;i<2;i++)
        {
            Fruit apple = new Fruit(getRandomLengthName("apple"),R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("banana"),R.drawable.ic_launcher_foreground);
            fruitList.add(banana);
            Fruit tomato = new Fruit(getRandomLengthName("tomato"),R.drawable.ic_launcher_background);
            fruitList.add(tomato);
        }
    }

    private String getRandomLengthName(String name)
    {
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for(int i=0 ; i<length ; i++){
            builder.append(name);
        }
        return builder.toString();
    }
}