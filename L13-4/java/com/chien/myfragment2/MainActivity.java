package com.chien.myfragment2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView1);
    }

    public void onClick(View view) {
        //import android.app.FragmentTransaction;
        //載入 fragment 交換 但還不會顯示
        FragmentTransaction ft = getFragmentManager().
                                 beginTransaction().
                                 setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        switch(view.getId()){
            case R.id.buttonA:
                ft.replace(R.id.fragment_addin_linearlayout, new FragmentA(), "fa");
                textView.setText("聖誕老公公");
                break;
            case R.id.buttonB:
                ft.replace(R.id.fragment_addin_linearlayout, new FragmentB(), "fb");
                textView.setText("聖誕樹");
                break;
        }
        ft.commit();
    }
}