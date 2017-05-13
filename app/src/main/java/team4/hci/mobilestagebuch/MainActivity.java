package team4.hci.mobilestagebuch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // Objekt für Listview deklarieren
    ListView listView;
    // für das Beispiel hier brauchen wir ein String
    // Adapter. Für Datenbanken brauchen wir Curseradapter
    ArrayAdapter<String> adapter;

    // Array erstellung für Probe der Liste
    String[] tagebuch_eintrag={
            "Erster Tag",
            "Zweiter Tag",
            "Dritter Tag",
            "Heute war alles scheiße",
            "Modellierung Test",
            "Erster Tag",
            "Zweiter Tag",
            "Dritter Tag",
            "Heute war alles scheiße",
            "Modellierung Test","Erster Tag",
            "Zweiter Tag",
            "Dritter Tag",
            "Heute war alles scheiße",
            "Modellierung Test"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.liste);
        // adapter initialisieren
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tagebuch_eintrag);
        // Adapter mit der Listview verbinden
        listView.setAdapter(adapter);
        // hier sorgen wir dafür, dass was passiert wenn wir auf ein Item
        // in der Liste clicken


    }
}
