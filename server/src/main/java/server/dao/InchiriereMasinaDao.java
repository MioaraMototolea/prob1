package server.dao;



import lib.dto.InchiriereMasina;

import javax.persistence.EntityManager;

public class InchiriereMasinaDao {
    private EntityManager em;

    public InchiriereMasinaDao(EntityManager em){
        this.em = em;

    }
    public  void inchiriereMasina(InchiriereMasina inchiriereMasina){

        em.persist(inchiriereMasina);
    }
}
