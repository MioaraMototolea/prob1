package client.controler;

import lib.dto.Masina;
import lib.dto.NumarInmatriculare;
import lib.service.IMainService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ClientController {
    private IMainService mainService;

    private ClientController() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 4545);
            mainService = (IMainService) registry.lookup("userServer");
        } catch (Exception e) {

        }
    }

    private static final class SingletonHolder {
        private static final ClientController INSTANCE = new ClientController();
    }

    public static ClientController getInstance() {

        return SingletonHolder.INSTANCE;
    }
    public void adaugaNumarInmatriculare(NumarInmatriculare numarInmatriculare){
        try {
            mainService.adaugaNumarInmatriculare(numarInmatriculare);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void adaugaMasina(Masina masina) {
        try {
            mainService.adaugaMasina(masina);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}