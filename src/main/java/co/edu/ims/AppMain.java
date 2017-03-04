/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims;

import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Silvia
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        EntityManagerFactory emf;
        EntityManager em;
        
        emf = Persistence.createEntityManagerFactory("peliculasPU");
        em = emf.createEntityManager();
        
        
        Genero accion = new Genero(1, "Peliculas de accion");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(accion); // Se persiste objeto en base de datos.
        tx.commit();
        
        Persona director = new Persona (1061, "Marcos",58,"Peruano");
        EntityTransaction tx1 = em.getTransaction();
        tx1.begin();
        em.persist(director); // Se persiste objeto en base de datos.
        tx1.commit();
        
        // TODO code application logic here
       
        // TODO code application logic here
        //INSTANCIAR UN OBJETO
//        Persona director =new Persona("Alejandra",12,"Colombia");
//        Genero accion=new Genero(123,"accion");
//        Pelicula conjuro=  new Pelicula();
//        conjuro.setTitulo("El conjuro");
//        conjuro.getDirector().add(director);
//        conjuro.getGenero().add(accion);
//        conjuro.setAnio(2013);
//        
//        System.out.println(conjuro.getTitulo());
        
//        String resultado=conjuro.MostrarDatos();
//        System.out.println(resultado);
//         System.out.println("");
//        String resultado1=guerramundialz.MostrarDatos();
//        System.out.println(resultado1);
    }
    
}
