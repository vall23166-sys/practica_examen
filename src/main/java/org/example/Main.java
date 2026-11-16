package org.example;

import com.google.gson.Gson;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. Creamos el estudiante y obtenemos su JSON con Gson
        Estudiante estudiante = new Estudiante("Valerii", 19);
        Gson gson = new Gson();
        String json = gson.toJson(estudiante);

        // 2. Convertimos ese JSON en un banner ASCII gigante con JFiglet
        String estudianteAscii = FigletFont.convertOneLine(json);

        // 3. Imprimimos el resultado final
        System.out.println(estudianteAscii);
    }
}