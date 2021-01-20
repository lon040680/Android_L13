package com.chien.mymenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //將設定好的MENU加入並顯示出來
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater(); //載入
        inflater.inflate(R.menu.menu_main, menu); //放到預設位置 右上角三個點
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_1:
            Toast.makeText(MainActivity.this, "item_1", Toast.LENGTH_SHORT).show();
            finish();
            break;
            case R.id.item_2:
                Toast.makeText(MainActivity.this, "item_2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_3:
                Toast.makeText(MainActivity.this, "item_3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_4:
                Toast.makeText(MainActivity.this, "item_4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_5:
                Toast.makeText(MainActivity.this, "item_5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_5_1:
                Toast.makeText(MainActivity.this, "item_5_1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_5_2:
                Toast.makeText(MainActivity.this, "item_5_2", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}