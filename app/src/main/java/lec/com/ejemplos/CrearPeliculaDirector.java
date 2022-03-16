package lec.com.ejemplos;

import lec.com.components.ConectorJPA;
import lec.com.model.Director;
import lec.com.model.Pelicula;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.apache.log4j.Logger;

public class CrearPeliculaDirector implements Runnable {

    Logger logger = Logger.getLogger(CrearPeliculaDirector.class);
    
    @Override
    public void run() {
        ConectorJPA conectorJPA = new ConectorJPA();
        EntityManager em = conectorJPA.getEntityManager();
        
        Director kubrick = new Director("200000001", "Stanley Kubrick");
        Director almodovar = new Director("200000002", "Pedro Almodovar");
        Director piñeyro = new Director("200000003", "Marcelo Piñeyro");
        Director grande = new Director("200000004", "Rodrigo Grande");
        Director cohen = new Director("200000005", "Hnos Cohen");
        
        Pelicula volver = new Pelicula("100000001", "Volver", almodovar);
        Pelicula barryLindon = new Pelicula("100000002", "Barry Lindon", kubrick);
        Pelicula plataQuemada = new Pelicula("100000003", "Plata Quemada", piñeyro);
        Pelicula alFinalDelTunel = new Pelicula("100000004", "Al final del tunel", grande);
        Pelicula noCountryForOldMen = new Pelicula("100000005", "No Country For Old Men", cohen);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(volver);
        em.merge(barryLindon);
        em.merge(plataQuemada);
        em.merge(alFinalDelTunel);
        em.merge(noCountryForOldMen);
        tx.commit();
    }
}