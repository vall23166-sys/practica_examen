package org.example;

import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String nombreEstudiante = "Valerii";
        String estudianteAscii = FigletFont.convertOneLine(nombreEstudiante);

        System.out.println(estudianteAscii);
    }
}
