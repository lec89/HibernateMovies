package lec.com;

import lec.com.ejemplos.CrearPeliculaDirector;

public class App {
    public String getGreeting() {
        return "Hibernando!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
                
        Runnable r = new CrearPeliculaDirector();
        r.run();
    }
}