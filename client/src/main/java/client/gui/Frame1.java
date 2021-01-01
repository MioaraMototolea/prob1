package client.gui;

import javax.swing.*;

public class Frame1 extends JFrame{
    private JButton inregistrareMasinaButton;
    private JButton inchiriereMasinaButton;
    private JPanel Frame1;
    private JButton vizualizareInchirieriButton;
    private JButton closeButton;

    public Frame1(){
        closeButton.addActionListener(ev ->{
            dispose();
            new LoginFrame();
        });
        inregistrareMasinaButton.addActionListener(ev -> new FrameClient());
        inchiriereMasinaButton.addActionListener(ev ->new InchiriereFrame());
        vizualizareInchirieriButton.addActionListener(ev ->new Frame2());

        setContentPane(Frame1);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
