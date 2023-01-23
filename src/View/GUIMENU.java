package View;

import Controller.FilmController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMENU extends JFrame
{
    JLabel gambar , Namafilm, JamTayang, Kursi,Codefilm;
    JTextField nama, jam, kursi,code;
    JButton create,update,delete,print;
    JTable table;

    JTable namatable;

    FilmController cfilm = new FilmController();
    public GUIMENU()
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

        Codefilm = new JLabel("Masukkan Code");
        Codefilm.setBounds(30,125,500,30);
        Codefilm.setForeground(Color.LIGHT_GRAY);
        add(Codefilm);

        code = new JTextField();
        code.setBounds(30,150,500,30);
        code.setBackground(Color.LIGHT_GRAY);
        code.setForeground(Color.BLACK);
        add(code);


        Namafilm = new JLabel("Masukkan Nama Film");
        Namafilm.setBounds(30,180,500,30);
        Namafilm.setForeground(Color.LIGHT_GRAY);
        add(Namafilm);

        nama = new JTextField();
        nama.setBounds(30, 210,200,30);
        nama.setBackground(Color.lightGray);
        nama.setForeground(Color.BLACK);
        add(nama);

        JamTayang = new JLabel("Masukkan Jam Tayang");
        JamTayang.setBounds(30,240,500,30);
        JamTayang.setForeground(Color.LIGHT_GRAY);
        add(JamTayang);

        jam = new JTextField();
        jam.setBounds(30,270,200,30);
        jam.setBackground(Color.LIGHT_GRAY);
        jam.setForeground(Color.BLACK);
        add(jam);

        Kursi = new JLabel("Masukkan Kursi");
        Kursi.setBounds(30,300,500,30);
        Kursi.setForeground(Color.LIGHT_GRAY);
        add(Kursi);

        kursi = new JTextField();
        kursi.setBounds(30,325,200,30);
        kursi.setBackground(Color.LIGHT_GRAY);
        kursi.setForeground(Color.BLACK);
        add(kursi);

        create = new JButton("CREATE");
        create.setBounds(30, 365,100,40);
        create.setBackground(Color.LIGHT_GRAY);
        create.setForeground(Color.BLACK);
        add(create);

        update = new JButton("UPDATE");
        update.setBounds(120, 365,100,40);
        update.setBackground(Color.LIGHT_GRAY);
        update.setForeground(Color.BLACK);
        add(update);

        delete = new JButton("DELETE");
        delete.setBounds(200, 365,100,40);
        delete.setBackground(Color.LIGHT_GRAY);
        delete.setForeground(Color.BLACK);
        add(delete);

        print = new JButton("PRINT");
        print.setBounds(30,410,100,40);
        print.setSize(270,30);
        print.setBackground(Color.LIGHT_GRAY);
        print.setForeground(Color.BLACK);
        add(print);

        table = new JTable();
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(305,190,350,240);
//        sp.setBackground(Color.LIGHT_GRAY);
//        sp.setForeground(Color.BLACK);
//        table.setBackground(Color.LIGHT_GRAY);
//        table.setForeground(Color.BLACK);
        table.setModel(new FilmController().listdata());
        add(sp);



        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Code = code.getText();
                String Nama = nama.getText();
                String Jam = jam.getText();
                String Kursi = kursi.getText();

                if (cfilm.search(Code) == null)
                {
                    cfilm.create(Code,Nama,Jam,Kursi);
                    code.setText("");
                    nama.setText("");
                    jam.setText("");
                    kursi.setText("");
                    JOptionPane.showMessageDialog(null, "DATA BERHASIL DITAMBAHKAN");
                }
                else
                    JOptionPane.showMessageDialog(null, "DATA SUDAH ADA");
            }
        });


        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Code = code.getText();
                String Nama = nama.getText();
                String Jam = jam.getText();
                String Kursi = kursi.getText();

                if (cfilm.search(Code)!= null)
                {
                    cfilm.update(Code,Nama,Jam,Kursi);
                    cfilm.create(Code,Nama,Jam,Kursi);
                    code.setText("");
                    nama.setText("");
                    jam.setText("");
                    kursi.setText("");
                    JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUPDATE");
                }
                else
                    JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN");
            }
        });


        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = code.getText();

                if (cfilm.search(data)!= null)

                    cfilm.delete(data);

                else
                    JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN");
            }
        });

        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                table.setModel(new FilmController().listdata());
            }
        });




        setVisible(true);
    }
}
