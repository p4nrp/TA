package View;

import Controller.FilmController;

import javax.swing.*;
import java.awt.*;

public class TABLE extends JFrame
{
    JLabel gambar;
    JTable table;

    public TABLE()
    {

        setSize(680,600);
        setLayout((LayoutManager) null);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(3);
        setLocationRelativeTo((Component)null);

        gambar = new JLabel();
        gambar.setIcon(new ImageIcon("C:\\Users\\luthf\\OneDrive\\Gambar\\tes4.png"));
        gambar.setBounds(150,50,2100,1500);
        gambar.setSize(300,110);
        add(gambar);


        table = new JTable();
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30,190,300,240);
        //namatable.setBackground(Color.LIGHT_GRAY);
        //namatable.setForeground(Color.BLACK);
        table.setModel(new FilmController().listdata());
        add(sp);
    }
}
