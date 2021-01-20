package com.chien.mymenu2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem item_1 = menu.add(0,0,0,"Ouit");
        item_1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS); //永遠顯示在外

        MenuItem item_2 = menu.add(0,1,1,"Go");
        MenuItem item_3 = menu.add(0,2,2,"Want");

        SubMenu sub_1 = menu.addSubMenu(0,3,3,"Other");
        sub_1.add(1,4,1,"Ae !");
        sub_1.add(1,5,2,"Oh !");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 0:
                Toast.makeText(MainActivity.this,"item_1",Toast.LENGTH_SHORT).show();
                finish();
                break;
            case 1:
                Toast.makeText(MainActivity.this,"item_2",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this,"item_3",Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(MainActivity.this,"item_4",Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(MainActivity.this,"item_5",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}