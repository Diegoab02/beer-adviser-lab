package com.hfad.beeradviser.educacion;

import java.util.ArrayList;
import java.util.List;

/**
 * Extension del laboratorio: devuelve los servicios asociados a
 * cada categoria de un aula virtual. Espeja la logica de BeerExpert.
 *
 * Categorias soportadas: foro, tarea, cuestionario, recurso, chat.
 */
public class ServiciosEducacionExpert {

    public List<String> getServicios(String categoria) {
        List<String> servicios = new ArrayList<>();
        switch (categoria) {
            case "foro":
                servicios.add("Foro tecnico");
                servicios.add("Foro social");
                servicios.add("Foro de aclaracion de dudas");
                break;
            case "tarea":
                servicios.add("Tarea individual");
                servicios.add("Tarea grupal");
                servicios.add("Tarea con rubrica");
                break;
            case "cuestionario":
                servicios.add("Cuestionario diagnostico");
                servicios.add("Cuestionario de repaso");
                servicios.add("Cuestionario evaluativo");
                break;
            case "recurso":
                servicios.add("Recurso archivo PDF");
                servicios.add("Recurso enlace URL");
                servicios.add("Recurso video");
                break;
            case "chat":
                servicios.add("Chat grupal");
                servicios.add("Chat de tutoria");
                servicios.add("Chat de soporte");
                break;
            default:
                servicios.add("No hay servicios para esta categoria.");
        }
        return servicios;
    }
}
