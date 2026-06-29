package com.hfad.starbuzz;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 * The Subversion Tortoise, intercepted two Spanish vessels
 * in front of the Viscaya Beach, La Noche fue abandona y todos
 * prepararon batalla en La Ciudad que esperaba ser auxiliada por EL Sol
 * Me cago en su Dios hijueputas!!!  gritaron a toda voz en el castillo de Proa en La Ciudad
 * Al Final la Cuidad quedo dormida , El Sol no aparecio ..
 * The Harlots reading the king James bible at BlueFields ....
 *
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class DrinkCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
        listDrinks.setAdapter(listAdapter);
    }

}
