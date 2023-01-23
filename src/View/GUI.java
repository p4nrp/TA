package View;

import Controller.LoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import Controller.LoginController;
public class GUI extends JFrame
{
    JFrame tampilanAwal = new JFrame();
    JLabel text,textusername, textpassword;
    JButton login;
    JTextField boxusername;
    JPasswordField boxpassword;
    private boolean ceklogin = false;
    public static LoginController logc = new LoginController();


     public GUI()
    {
        setSize(680,600);
        setLayout((LayoutManager) null);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(3);
        setLocationRelativeTo((Component)null);


        text = new JLabel();
        text.setIcon(new ImageIcon("C:\\Users\\luthf\\OneDrive\\Gambar\\tes4.png"));
        text.setBounds(150,50,2100,1500);
        text.setSize(300,110);
//        this.text.setFont(new Font("BebasNeue-Regular",3,50) );
//        text.setForeground(Color.RED);
        add(text);


        textusername = new JLabel("User");
        textusername.setBounds(30,180,50,30);
        textusername.setForeground(Color.LIGHT_GRAY);
        add(textusername);


        boxusername = new JTextField("");
        boxusername.setBounds(30, 210,200,30);
        boxusername.setBackground(Color.lightGray);
        boxusername.setForeground(Color.BLACK);
        add(boxusername);

        textpassword = new JLabel("Password");
        textpassword.setBounds(30,240,100,30);
        textpassword.setForeground(Color.LIGHT_GRAY);
        add(textpassword);



        boxpassword = new JPasswordField("");
        boxpassword.setBounds(30,270,200,30);
        boxpassword.setBackground(Color.lightGray);
        boxpassword.setForeground(Color.BLACK);
        add(boxpassword);


        login = new JButton("LOGIN");
        login.setBounds(90, 320,100,40);
        login.setBackground(Color.LIGHT_GRAY);
        login.setForeground(Color.BLACK);
        add(login);

        setVisible(true);




        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = boxusername.getText();
                String password = boxpassword.getText();
                boolean status = logc.loginstep(username,password);
                if(status)
                {
                    new GUIMENU().setVisible(true);
                }else
                {
                    JOptionPane.showMessageDialog(null, "Username Atau Password Salah");
                }
            }
        });
    }


}
