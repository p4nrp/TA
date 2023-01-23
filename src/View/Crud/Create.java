package View.Crud;

import Controller.FilmController;

import java.util.Scanner;

public class Create
{
    FilmController controlfilm = new FilmController();

    Scanner input = new Scanner(System.in);

    public void create()
    {
        System.out.println("Masukkan kode Data : ");
        String code = input.nextLine();
        System.out.println("Masukkan Judul Film : ");
        String judul = input.nextLine();
        System.out.println("Masukkan Jam Tayang");
        String jam = input.nextLine();
        System.out.println("Masukkan Kursi : ");
        String kursi = input.nextLine();

        controlfilm.create(code, judul, jam, kursi);
    }
}
