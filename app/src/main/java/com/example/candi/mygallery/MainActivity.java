package com.example.candi.mygallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    public  Integer[] images = {
             R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5,
             R.drawable.b6, R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10,
            R.drawable.b11, R.drawable.b12, R.drawable.b13, R.drawable.b14,R.drawable.b1
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView)findViewById(R.id.gr1);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), FullImageActivity.class);
                intent.putExtra("id", i);
                startActivity(intent);
            }
        });
    }
}
