package View;

import Controller.DashboardController;
import Controller.LoginController;

import java.util.Scanner;

public class LoginPage
{
    private Scanner input = new Scanner(System.in);

    private LoginController loginc = new LoginController();
    public void login()
    {
        while(true)
        {
            System.out.println();
            System.out.println("Masukkan Username : " );
            String username = input.nextLine();

            System.out.println("Masukkan Password : ");
            String password = input.nextLine();

            boolean status = loginc.loginstep(username, password);

            if (status)
            {
                new DashboardController().redirecttomenu();//System.out.println("Login Berhasil");
            }
            else
            {
                System.out.println("Login Gagal");
            }
        }
    }
}
