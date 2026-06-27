package com.hfad.starbuzz;

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
 * load the starboard guns, muskets on the stern
 * la Dulceje fue decapitada en Cot de Cartago, Hijueputas!!
 * Cartago was a market inside of a shooting star landing cave
 * Cuando muchos mean y han cagado dentro de una cueva con cara oculta
 * esta se vuelve viva y aparece como el pequeño valle de Tirrases ...
 * La Mierda de Breda fue puesta en todas sus cuevas en Coronado
 * Sir Henry Morgan ha venido a recaudar el sueldo del Tercio Gales que no han pagado.
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    //drinks is an array of drinks
    public static final Drink[] drinks = {
            new Drink("Latte","A couple of expresso shots with steamed milk",R.drawable.latte),
            new Drink("Cappuccino","Espresso, hot milk and steamed milk foam",R.drawable.capuccino),
            new Drink("Filter","Highest quality beans roasted and brewed fresh",R.drawable.filter)
    };
}
