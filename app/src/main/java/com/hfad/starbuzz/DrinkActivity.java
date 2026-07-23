package com.hfad.starbuzz;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
 * tossing with brave men
 * celebrating the Kings will
 * U jarras , U.jar, sa U.jar
 * El Duque de Alba era socio de Henry Morgan
 * U.jar sa era una compañia que daba el servicio de
 * catapulta estratosferica aprovechando la presion
 * del Lago glacial de Talamanca que tenia alcance
 * a zonas de tiempo 10 mil años atras,
 * Religiosos cristianos de los tiempos de Roosevelt vinieron y rompieron el lago
 * argumentando la duda que dejan los que viajan al tiempo pasado y plantan cosas al futuro.
 *
 * la laguna de bajo piuses era de piscicultores gallegos que sabian que en los
 * barros glaciales habian crustaceos prehistoricos que daban una longevidad
 * que doblaba la vida, conforme la poblacion se comio los crustaceos
 * la progresion cerebral promedio desigualo el milagro y el valor se perdio
 * pero por un tiempo fueron millonarios todos los recolectores de CostaRica ...
 *
 * Despues la sociedad vendia vinos de las costas de parrita que contaban el pasado
 * y eran populares en Turquia, siria y azerbayan, Como los locos de los tiempos de tinoco
 * ponian una botella con arsenico cada mil, vino una flota de musulmanes y les dinamito la colonia chilena
 * que holandizaba la desembocadura del rio virilla y bloquearon el cauce del rio barranca con un derrumbe
 * que provoco un cataclismo
 *
 * Legionarios Españoles y alemanes que pactaron desmilitarizarse , les fue dada CostaRica como refugio que
 * podian administrar de pais a cambio de salir de Groenlandia, en los 80s eran ancianos los ultimos
 * que salieron en IBERIA a la muerte de Somoza
 *
 * La poblacion de CostaRica fue moldeada  y educada desde bangladesh ,tailandia e indonesia
 * y los tico somos indonesios abandonados por una compañia española,
 *
 * CostaRica NO TIENE EJERCITO, DIRLEWANGER ES DE HEREDIA HIJUePUTA S NIKAS !!!
 * En la Guerra de los Contras La Dirlewanger de Heredia que es la Legion Talamanca
 * le mato los coroneles y embajadores en varios paises a Honduras , Guatemala y Nicaragua
 *
 * Esta es la historia que se creen los Agentes De la DIS
 * Miguel Salguero esta en Ochomogo atestiguando la muerte de Viviana Gallardo
 *
 * Los de Acme que usaban el edificio de Tribu , eran playos compas de unos profes del Tecnologico
 * que tenian nexos con el ICE y conocian excavaciones exploratorias de hasta 800 metros, sabian
 * traerse poquitos de arena del fondo y hacer brotar camarones con sales de Utha, murieron
 * adentro de uno de estos huecos, en la tarde de haberme yo entrevistado con ellos por que iba a
 * trabajarles de programador de java de implementar SDks bancarios en spring, nunca me llamaron
 * y el contrato quedo en el escritorio de la muchacha, era una muchacha y dos muchachos muy nerdos.
 * Les gustaba jugar de indiana jones y sabian entrar en huecos de exploracion de antes de la construccion
 * del la represa de Tarcoles, Pudieron tener trabajo temporal de operadores de excavadora subterranea
 * y con el disparate que era acme disfrazaban el monton de dinero que se pagaban ...
 * Casi que acme era un experimento financiero de una compañia de tres personas que tenian muchisima ganancia
 *
 * Los Mato el BAC o se habran muerto de muerte natural ? mandeme una motica para ir a investigar
 * A mi me da colera que tribu era chivisima y la officina tambien
 * tenian un compa de Java que iba a ser mi compañero, creo que esta desaparecido
 *
 * Joseph Bradley y sus lancheros son los dueños de Matina , fueron al pasado y la dejaron existir.
 * El Duque de Alba aparece por el mercado central de SanJose, si uno se prepara y Niega fuertemente
 * que los Testigos de jehova son ciertos , el Duque saluda alegremente y aparece propinas ...
 *
 * The Wind is High , The Night is fair ...
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        //get drink from intent
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        //Drink drink = Drink.drinks[drinkId];
        //Create cursor
        SQLiteOpenHelper starbuzzDatabaseHelper = new StarbuzzDatabaseHelper(this);
        try{
            SQLiteDatabase db = starbuzzDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query("DRINK",new String[]{"NAME","DESCRIPTION","IMAGE_RESOURCE_ID"},
                    "_id = ?",
                    new String[]{Integer.toString(drinkId)},
                    null,null,null);
        }catch (SQLiteException e){
            Toast toast = Toast.makeText(this,"Database Unavailable",Toast.LENGTH_SHORT);
            toast.show();
        }
        //populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getDescription());

        //populate the drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());

        //populate the drink image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }

}
