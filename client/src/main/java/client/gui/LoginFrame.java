package client.gui;

import client.controler.UserControler;
import lib.dto.UserDTO;

import javax.swing.*;

public class LoginFrame extends JFrame{
    private JTextField textField1;
    private JButton loginButton;
    private JButton signInButton;
    private JPanel mainPanel;
    private JPasswordField passwordField1;

    public LoginFrame() {
        loginButton.addActionListener(ev ->{
            String username = textField1.getText();
            String password = new String(passwordField1.getPassword());
            UserDTO userDTO = new UserDTO(0, username, password);

            try{
                int id = UserControler.getInstance().login(userDTO);
                JOptionPane.showMessageDialog(null, " Conectat ca "+id);
            }catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, "User sau parola gresita");
                passwordField1.setText("");
            }

        });

        signInButton.addActionListener(ev ->{
            String username = textField1.getText();
            String password = new String(passwordField1.getPassword());
            UserDTO userDTO = new UserDTO(0, username, password);

            try{
                int id = UserControler.getInstance().signin(userDTO);
                JOptionPane.showMessageDialog(null, " Inregistrat ca "+ username );
                new Frame1();
            }catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, "Username folosit");
                passwordField1.setText("");
                textField1.setText("");
            }

        });
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
