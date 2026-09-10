package com.hfad.beeradviser.educacion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hfad.beeradviser.R;

import java.util.List;

/**
 * Actividad de la extension del laboratorio: al elegir una categoria
 * de un aula virtual (foro, tarea, cuestionario, recurso, chat)
 * muestra los servicios correspondientes.
 */
public class EducacionVirtualActivity extends AppCompatActivity {

    private final ServiciosEducacionExpert expert = new ServiciosEducacionExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educacion_virtual);

        Button mostrar = findViewById(R.id.mostrar_servicios);
        mostrar.setOnClickListener(this::onClickMostrarServicios);
    }

    public void onClickMostrarServicios(View view) {
        Spinner categoria = findViewById(R.id.categoria);
        TextView servicios = findViewById(R.id.servicios);

        String cat = String.valueOf(categoria.getSelectedItem());
        List<String> lista = expert.getServicios(cat);

        StringBuilder salida = new StringBuilder();
        for (String s : lista) {
            salida.append("• ").append(s).append('\n');
        }
        servicios.setText(salida.toString().trim());
    }
}
