package ec.edu.utpl.pintegrativa.jpa.controller;

import ec.edu.utpl.pintegrativa.jpa.entity.Direccion;
import ec.edu.utpl.pintegrativa.jpa.entity.Estudiante;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JPAExample {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("default");
        EntityManager em = emFactory.createEntityManager();

        TypedQuery<Estudiante> qry = em.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
        List<Estudiante> estudiantes = qry.getResultList();

        for (Estudiante est : estudiantes) {
            System.out.println(est.getApellido());
            for(Direccion d : est.getDirecciones()) {
                System.out.printf("Ciudad: %s\n", d.getCiudad());
                System.out.printf("Calle: %s\n", d.getCalle());
                System.out.printf("Número: %s\n", d.getNumero());
            }
        }
        em.close();
    }
}
