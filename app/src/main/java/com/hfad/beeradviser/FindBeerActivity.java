package com.hfad.beeradviser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hfad.beeradviser.educacion.EducacionVirtualActivity;

import java.util.List;

/**
 * Actividad principal del laboratorio Beer Adviser.
 * Usa un Spinner para elegir el color de cerveza y muestra
 * las marcas recomendadas devueltas por la clase BeerExpert.
 *
 * Incluye un boton para abrir la actividad de la extension:
 * Servicios de Educacion Virtual.
 */
public class FindBeerActivity extends AppCompatActivity {

    private final BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

        Button findBeer = findViewById(R.id.find_beer);
        findBeer.setOnClickListener(this::onClickFindBeer);

        Button abrirExtension = findViewById(R.id.abrir_extension);
        abrirExtension.setOnClickListener(v -> startActivity(
                new Intent(this, EducacionVirtualActivity.class)));
    }

    /**
     * Se invoca al pulsar "Find Beer!". Lee el color del Spinner,
     * consulta la clase BeerExpert y muestra el resultado en el TextView.
     */
    public void onClickFindBeer(View view) {
        Spinner color = findViewById(R.id.color);
        TextView brands = findViewById(R.id.brands);

        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandsList = expert.getBrands(beerType);

        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted.toString().trim());
    }
}
