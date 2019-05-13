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
    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        textViewName = findViewById(R.id.textViewName);
        textViewDescription = findViewById(R.id.textViewDescription);
        imageView = findViewById(R.id.imageViewDrinkIMG);
        //Intent intent = getIntent();
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];


        String name = drink.getName();
        String description = drink.getDescription();
        int imageSrc = drink.getImageResourceId();
        textViewName.setText(name);
        textViewDescription.setText(description);
        imageView.setImageResource(imageSrc);
    }
}
