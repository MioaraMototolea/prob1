package client.gui;

import javax.swing.*;

public class Frame2 extends JFrame{
    private JPanel Frame2;
    private JTextField textField1;
    private JButton cautaButton;
    private JButton closeButton;


    public Frame2(){

        closeButton.addActionListener(ev ->{
            dispose();
            new Frame1();
        });
        setContentPane(Frame2);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
