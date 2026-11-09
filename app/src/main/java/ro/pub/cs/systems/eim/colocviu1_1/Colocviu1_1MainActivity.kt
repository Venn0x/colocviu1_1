package ro.pub.cs.systems.eim.colocviu1_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class Colocviu1_1MainActivity : AppCompatActivity() {


    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        /* Trebuie sa apelam metoda din clasa de baza întrucât API-ul Android
        furnizează o implementare implicită pentru salvarea stării unei
        activități, parcurgând ierarhia de componente grafice (obiecte de tip
        `View`) care au asociat un identificator (`android:id`), folosit drept
        cheie în obiectul `Bundle`. Astfel, de regulă, pentru elementele
        interfeței grafice, nu este necesar să se mențină starea, acest lucru
        fiind realizat în mod automat, cu respectarea condiției menționate.
        super.onSaveInstanceState(savedInstanceState); */

        super.onSaveInstanceState(savedInstanceState)

        /* Determian o referinta pentru obiectul de tip EditText din interfata grafica
           cu ID-ul username_edit_text */
        val button_presses = findViewById<TextView>(R.id.button_presses)
        savedInstanceState.putString("BUttonPresses", button_presses.text.toString())
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_colocviu1_1_main)

        var TextValue = ", "
        var buttonPress = 0;

        if ((savedInstanceState != null) && (savedInstanceState.getString("BUttonPresses") != null)) {
            val SavedState =
                savedInstanceState.getString("BUttonPresses")?.replace("Button presses: ", "")
            buttonPress = SavedState!!.toInt();
            findViewById<TextView>(R.id.text_buttons).setText(savedInstanceState.getString("BUttonPresses"))

        }

        findViewById<Button>(R.id.north_button).setOnClickListener {
            TextValue = TextValue + "North, ";
            findViewById<TextView>(R.id.text_buttons).setText(TextValue)
            buttonPress++
            findViewById<TextView>(R.id.button_presses).setText("Button presses: " + buttonPress)
            findViewById<TextView>(R.id.text_buttons).setText(findViewById<TextView>(R.id.text_buttons).text.dropLast(2))

        }

        findViewById<Button>(R.id.south_button).setOnClickListener {
            TextValue = TextValue + "South, ";
            findViewById<TextView>(R.id.text_buttons).setText(TextValue)
            buttonPress++
            findViewById<TextView>(R.id.button_presses).setText("Button presses: " + buttonPress)
            findViewById<TextView>(R.id.text_buttons).setText(findViewById<TextView>(R.id.text_buttons).text.dropLast(2))

        }

        findViewById<Button>(R.id.east_button).setOnClickListener {
            TextValue = TextValue + "East, ";
            findViewById<TextView>(R.id.text_buttons).setText(TextValue)
            buttonPress++
            findViewById<TextView>(R.id.button_presses).setText("Button presses: " + buttonPress)
            findViewById<TextView>(R.id.text_buttons).setText(findViewById<TextView>(R.id.text_buttons).text.dropLast(2))

        }

        findViewById<Button>(R.id.west_button).setOnClickListener {
            TextValue = TextValue + "West, ";
            findViewById<TextView>(R.id.text_buttons).setText(TextValue)
            buttonPress++
            findViewById<TextView>(R.id.button_presses).setText("Button presses: " + buttonPress)
            findViewById<TextView>(R.id.text_buttons).setText(findViewById<TextView>(R.id.text_buttons).text.dropLast(2))

        }

        findViewById<Button>(R.id.south_button).setOnClickListener {


        }

    }
}