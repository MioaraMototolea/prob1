package client.controler;

import lib.dto.UserDTO;
import lib.service.UserService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class UserControler {
    private static final class SingletonHolder{
        public static final UserControler INSTANCE = new UserControler();

    }
    private UserService userService;
    private UserControler(){
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",4545);
            userService = (UserService) registry.lookup("userService");
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static UserControler getInstance(){
        return SingletonHolder.INSTANCE;
    }
    public int login(UserDTO userDTO){
        try {
            return userService.login(userDTO);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public  int signin(UserDTO userDTO){
        try {
            return userService.signin(userDTO);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
