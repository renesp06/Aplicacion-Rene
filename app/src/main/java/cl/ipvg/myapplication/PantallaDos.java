package cl.ipvg.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaDos extends AppCompatActivity {
    private Button  bTVolver;
    private  Button bTCerrar;
     private TextView tVNombreFinal;
     private TextView tVAsignaturaFinal;
     private TextView  tVNotaUno;
     private TextView tVNotaDos;
     private TextView tVNotaTres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bTVolver = (Button) findViewById(R.id.bTVolver);
        bTCerrar = (Button) findViewById(R.id.bTCerrar);
        tVNombreFinal = (TextView) findViewById(R.id.tVNombreFinal);
        tVAsignaturaFinal = (TextView) findViewById(R.id.tVAsignaturaFinal);
        tVNotaUno = (TextView) findViewById(R.id.tVNotaUno);
        tVNotaDos = (TextView) findViewById(R.id.tVNotaDos);
        tVNotaTres = (TextView) findViewById(R.id.tVNotaTres);

        Intent intentnombrefinal = getIntent();
        double intentnotaunofinal = intentnombrefinal.getDoubleExtra("promedionotauno",0);
        double intentnotadosfinal = intentnombrefinal.getDoubleExtra("promedionotados",0);
        double intentnotatresfinal = intentnombrefinal.getDoubleExtra("promedionotatres",0);
        String nombreresultado = intentnombrefinal.getStringExtra("nombre");
        String asignaturaresultado= intentnombrefinal.getStringExtra("asignatura");



        tVNombreFinal.setText(nombreresultado);
        tVAsignaturaFinal.setText(asignaturaresultado);
        String notaunofinal = "  " + intentnotaunofinal;
        tVNotaUno.setText(notaunofinal);
        String notadosfinal = "  " + intentnotadosfinal;
        tVNotaDos.setText(notadosfinal);
        String notatresfinal = "  " + intentnotatresfinal;
        tVNotaTres.setText(notatresfinal);





        Intent intentvolverfinal = new Intent(this,MainActivity.class);
        bTVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentvolverfinal);
            }
        });


    }
}