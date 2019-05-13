package com.example.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.starbuzz.DrinkActivity.EXTRA_DRINKID;

public class DrinksActivitu extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_activitu);
        listView=findViewById(R.id.listViewCoffees);
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Drink.drinks);
        listView.setAdapter(listAdapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Drink drink= Drink.drinks[position];
                Intent intent = new Intent(getApplicationContext(),DrinkActivity.class);
                intent.putExtra(EXTRA_DRINKID, (int) id);
                /*intent.putExtra("name",drink.getName());
                intent.putExtra("description", drink.getDescription());
                intent.putExtra("imageSrc",drink.getImageResourceId());*/
                startActivity(intent);

            }
        });
    }
}
