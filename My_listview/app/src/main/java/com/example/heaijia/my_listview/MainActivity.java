package com.example.heaijia.my_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutmanager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        FruitAdapter adapter =new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);




    }

    private void initFruits() {
        for(int i=0;i<2;i++){
            Fruit apple =new Fruit ("格纹宽管裤",R.drawable.apple_pic);
            fruitList.add(apple);

            Fruit banana =new Fruit ("加大码长版大衣",R.drawable.banana_pic);
            fruitList.add(banana);

            Fruit pear =new Fruit ("弹力紧身裤",R.drawable.pear_pic);
            fruitList.add(pear);

            Fruit pineapple =new Fruit ("修身秋款风衣",R.drawable.pineapple_pic);
            fruitList.add(pineapple);

            Fruit strawberry =new Fruit ("撞色装饰针织衫",R.drawable.strawberry_pic);
            fruitList.add(strawberry);

            Fruit mango =new Fruit ("加大码风衣",R.drawable.mango_pic);
            fruitList.add(mango);

            Fruit cherry =new Fruit ("羊毛加大码外套",R.drawable.cherry_pic);
            fruitList.add(cherry);

            Fruit watermelon =new Fruit ("垂性及踝裤",R.drawable.watermelon_pic);
            fruitList.add(watermelon);


        }
    }
}
