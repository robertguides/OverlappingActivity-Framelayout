package com.example.guides.overlappingactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button BTN_1;
    ImageView IMG_1,IMG_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTN_1 = (Button) findViewById(R.id.BTN1);
        IMG_1 = (ImageView) findViewById(R.id.IMG1);
        IMG_2 = (ImageView) findViewById(R.id.IMG2);

        BTN_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IMG_1.getVisibility() ==View.VISIBLE){
                    IMG_1.setVisibility(View.GONE);
                    IMG_2.setVisibility(View.VISIBLE);

                }
                else{
                    IMG_2.setVisibility(View.GONE);
                    IMG_1.setVisibility(View.VISIBLE);

                }
            }
        });

        ;
    }
}
