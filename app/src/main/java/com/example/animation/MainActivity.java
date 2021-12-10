package com.example.animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnBottomSheetBehavior;
    Button btnBottomSheetFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBottomSheetBehavior=findViewById(R.id.button_bottomsheetlayout);
        btnBottomSheetFragment=findViewById(R.id.button_bottomsheetfragment);

        btnBottomSheetBehavior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,PersistentBottomSheetActivity.class));
            }
        });

        btnBottomSheetFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentModalBottomSheet fragmentModalBottomSheet=new FragmentModalBottomSheet();
                fragmentModalBottomSheet.show(getSupportFragmentManager(),"BottomSheet Fragment");
            }
        });




    }
}