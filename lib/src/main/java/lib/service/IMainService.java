package lib.service;


import lib.dto.InchiriereMasina;
import lib.dto.Masina;
import lib.dto.NumarInmatriculare;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMainService extends Remote {
    //locul in care definim metodele pe care clientul le va apela Remote

    public void adaugaMasina(Masina masina) throws RemoteException;
    public void adaugaInchiriere(InchiriereMasina inchiriere)throws RemoteException;
    public void adaugaNumarInmatriculare(NumarInmatriculare numarInmatriculare)throws RemoteException;
}
