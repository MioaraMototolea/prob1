package server.service;


import lib.dto.InchiriereMasina;
import lib.dto.Masina;
import lib.dto.NumarInmatriculare;
import lib.service.IMainService;
import server.dao.InchiriereMasinaDao;
import server.dao.MasinaDao;
import server.dao.NumarInmatriculareDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IMainServiceImpl extends UnicastRemoteObject implements IMainService {
    private EntityManagerFactory emf;
    public IMainServiceImpl() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("proiectPU");

    }

    @Override
    public void adaugaMasina(Masina masina) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        MasinaDao masinaDao = new MasinaDao(em);
        em.getTransaction().begin();
        masinaDao.adaugaMasina(masina);
        em.getTransaction().commit();
        em.close();
    }
    @Override
    public void adaugaInchiriere(InchiriereMasina inchiriere) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        InchiriereMasinaDao inchiriereDao = new InchiriereMasinaDao(em);
        em.getTransaction().begin();
       inchiriereDao.inchiriereMasina(inchiriere);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void adaugaNumarInmatriculare(NumarInmatriculare numarInmatriculare) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        NumarInmatriculareDao numarInmatriculareDao = new NumarInmatriculareDao(em);
        em.getTransaction().begin();
        numarInmatriculareDao.adaugaNumarInmatriculare(numarInmatriculare);
        em.getTransaction().commit();
        em.close();
    }
}
