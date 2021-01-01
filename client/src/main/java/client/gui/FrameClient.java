package client.gui;

import client.controler.ClientController;
import lib.dto.Marca;
import lib.dto.Masina;
import lib.dto.NumarInmatriculare;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FrameClient extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton inregistrareButton;
    private JPanel panelClient;
    private JButton closeButton;


    public FrameClient(){

        closeButton.addActionListener(ev ->{
            dispose();
            new Frame1();
        });

        inregistrareButton.addActionListener(ev ->{
            String judet = textField2.getText();
            String numar = textField3.getText();
            String cod = textField4.getText();
            NumarInmatriculare numarInmatriculare = new NumarInmatriculare(judet, numar,cod );
            Masina masina = new Masina(0,numarInmatriculare,}
            switch(textField1.getText()) {

                    case "VOLVO": {
                        Marca marca = Marca.VOLVO;
                        break;
                    }
                    case "VW": {
                        Marca marca = Marca.VW;
                        break;
                    }
                    case "FORD": {
                        Marca marca = Marca.FORD;
                        break;
                    }
                    case "KIA": {
                        Marca marca = Marca.KIA;
                        break;
                    }
                    case "TOYOTA": {
                        Marca marca = Marca.TOYOTA;
                        break;
                    }
                    default:
                        JOptionPane.showMessageDialog(this, " Introduceti marca masinii");
                        System.out.println("Introduceti marca masinii");
                }



            ClientController.getInstance();

            JOptionPane.showMessageDialog(this,"A fost adaugata o inregistrare masina");


        setContentPane(panelClient);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);


    }

}
