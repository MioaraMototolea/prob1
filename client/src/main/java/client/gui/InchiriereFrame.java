package client.gui;

import client.controler.ClientController;
import lib.dto.InchiriereMasina;


import javax.swing.*;
import java.util.concurrent.Callable;


public class InchiriereFrame extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton inchiriereButton;
    private JButton closeButton;
    private JPanel InchiriereFrame;

    public InchiriereFrame(){

        closeButton.addActionListener(ev ->{
            dispose();
            new Frame1();
        });

        inchiriereButton.addActionListener(ev -> {
                    String numarInmatriculare = textField1.getText();
                    String date = textField2.getText();

                    InchiriereMasina inchiriereMasina = new InchiriereMasina(numarInmatriculare, date);

                      ClientController.getInstance();
                }


            setContentPane(InchiriereFrame);
            pack();
            setLocationRelativeTo(null);
            setVisible(true);

        }


}