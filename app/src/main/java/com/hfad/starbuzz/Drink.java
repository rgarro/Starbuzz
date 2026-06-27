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
 * Los Testigos de JHehova deben irse , su rey ha murido en la guerra
 * CostaRica era una provincia de siervos Incas testigos de jehova
 * Henry Morgan ha decapitado a todos lo que no se bautizaron en el nevo Cartago();
 * los vendio al Papa en Milan y el sueldo del tercio pago.
 *Los dejaban secar caffe con cannabis de Algeria para que recordaran que fueron enemigos deben hablar español
 *
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

    //each Drink has a name description and img resource
    private Drink(String name,String description,int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
