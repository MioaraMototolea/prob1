package server.dao;

import lib.dto.NumarInmatriculare;
import lib.dto.UserDTO;
import server.model.User;

import javax.persistence.EntityManager;

public class NumarInmatriculareDao {
    private EntityManager em;

    public NumarInmatriculareDao(EntityManager em){
        this.em = em;

    }
    public  void adaugaNumarInmatriculare(NumarInmatriculare numarInmatriculare){

            numarInmatriculare.setNumar(numarInmatriculare.getNumar());
            numarInmatriculare.setJudet(numarInmatriculare.getJudet());
            numarInmatriculare.setCod(numarInmatriculare.getCod());
            em.getTransaction().begin();
            em.persist(numarInmatriculare);
            em.getTransaction().commit();
        }

}
