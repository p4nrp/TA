package View.Crud;

import Controller.FilmController;

import java.util.Scanner;

public class Delete
{
    FilmController controlfilm = new FilmController();
    Scanner input = new Scanner(System.in);

    public void delete()
    {
        System.out.println("Masukkan code film yang akan dihapus : ");
        String code = input.nextLine();

        if (controlfilm.search(code)!=null)
            controlfilm.delete(code);
    }
}
