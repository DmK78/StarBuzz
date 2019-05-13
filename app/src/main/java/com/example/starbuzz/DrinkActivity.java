package com.example.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {
    TextView textViewName;
    TextView textViewDescription;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        textViewName=findViewById(R.id.textViewName);
        textViewDescription=findViewById(R.id.textViewDescription);
        imageView=findViewById(R.id.imageViewDrinkIMG);
        Intent intent=getIntent();
        String name = intent.getStringExtra("name");
        String description = intent.getStringExtra("description");
        int imageSrc=intent.getIntExtra("imageSrc",0);
        textViewName.setText(name);
        textViewDescription.setText(description);
        imageView.setImageResource(imageSrc);
    }
}
