package server.dao;
import lib.dto.Marca;
import lib.dto.Masina;

import javax.persistence.EntityManager;

public class MasinaDao {
    private EntityManager em;

    public MasinaDao(EntityManager em){
        this.em = em;

    }


    public void adaugaMasina(Masina masina) {
             em.persist(masina);
    }
}
