package org.example;

import com.google.gson.Gson;

public class Main {
    static void main() {
        Estudiante estudiante = new Estudiante("Valerii", 19);
        Gson gson = new Gson();
        String json = gson.toJson(estudiante);

        System.out.println(json);

    }
}
