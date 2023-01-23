package View.Crud;

import Controller.FilmController;

import java.util.Scanner;

public class Update
{
    FilmController controlfilm = new FilmController();
    Scanner input = new Scanner(System.in);

    public void update()
    {
        System.out.println("Masukkan code film yang akan diedit");
        String code = input.nextLine();

        if (controlfilm.search(code)!=null)
        {
            input(code);
        }
        else {
            System.out.println("Code film tidak ditemukan");
        }
    }

    public void input(String code)
    {
        System.out.println("Masukkan judul film : ");
        String judul = input.nextLine();
        System.out.println("Masukkan Jam Tayang : ");
        String jam = input.nextLine();
        System.out.println("Masukkan Kursi");
        String kursi = input.nextLine();

        controlfilm.update(code,judul,jam,kursi);

    }
}
