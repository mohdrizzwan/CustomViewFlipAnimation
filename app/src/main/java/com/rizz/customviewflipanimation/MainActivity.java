package com.rizz.customviewflipanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.rizz.customviewfliplib.CustomFlipAnimation;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView hello_txt;
    ImageView img_src,img_src1;
    Button animate_btn;
    ArrayList<View> viewArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello_txt = findViewById(R.id.hello_txt);
        img_src = findViewById(R.id.img_src);
        img_src1 = findViewById(R.id.img_src1);
        animate_btn = findViewById(R.id.animate_btn);
        viewArrayList.add(img_src);
        viewArrayList.add(img_src1);
        viewArrayList.add(hello_txt);
        animate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i =0;i < viewArrayList.size();i++)
                {
                    CustomFlipAnimation flipAnimation = new CustomFlipAnimation(viewArrayList.get(i));
                    viewArrayList.get(i).startAnimation(flipAnimation);
                }
            }
        });
    }
}
