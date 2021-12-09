package cl.ipvg.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import cl.ipvg.myapplication.Calcular_Nota;

public class MainActivity extends AppCompatActivity {
    private EditText eTNombre;
    private EditText eTAsignatura;
    private EditText eTDireccion;
    private EditText eTNotaUno;
    private EditText eTNotaDos;
    private EditText eTNotaTres;
    private Button bTCalcular;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bTCalcular = (Button) findViewById(R.id.bTCalcular);
        eTNombre = (EditText) findViewById(R.id.eTNombre);
        eTAsignatura = (EditText) findViewById(R.id.eTAsignatura);
        eTDireccion = (EditText) findViewById(R.id.eTDireccion);
        eTNotaUno = (EditText) findViewById(R.id.eTNotaUno);
        eTNotaDos = (EditText) findViewById(R.id.eTNotaDos);
        eTNotaTres = (EditText) findViewById(R.id.eTNotaTres);
        inicializarFireBase();
        listarDtos();







            Intent intentenviar = new Intent(this, PantallaDos.class);

            bTCalcular.setOnClickListener(new View.OnClickListener() {
                double promedionotauno,promedionotados,promedionotatres;
                String calculouno,calculodos,calculotres,nombre,asignatura;
                @Override


                public void onClick(android.view.View view) {
                   try {
                        calculouno = eTNotaUno.getText().toString();
                        calculodos = eTNotaDos.getText().toString();
                        calculotres = eTNotaTres.getText().toString();
                       nombre = eTNombre.getText().toString();
                        asignatura = eTAsignatura.getText().toString();
                 promedionotauno = Double.parseDouble(calculouno) * 0.25;
                 promedionotados = Double.parseDouble(calculodos) * 0.35;
                 promedionotatres = Double.parseDouble(calculotres) * 0.40;


            } catch(NumberFormatException nfe) { System.out.println("Could not parse " + nfe);}


                    intentenviar.putExtra("promedionotauno", promedionotauno);
                    intentenviar.putExtra("promedionotados", promedionotados);
                    intentenviar.putExtra("promedionotatres", promedionotatres);
                    intentenviar.putExtra("nombre", nombre);
                    intentenviar.putExtra("asignatura", asignatura);

                    startActivity(intentenviar);
                }
            });


    }



    private void inicializarFireBase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }
    private void listarDtos() {
    }


}

