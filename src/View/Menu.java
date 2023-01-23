package View;
import Entity.FilmEntity;
import Model.Film;
import View.Crud.Create;
import View.Crud.Delete;
import View.Crud.Update;

import java.util.ArrayList;
import java.util.Scanner;
public class Menu
{
    Scanner input =  new Scanner(System.in);

    public void menu()
    {
        int pilihan = -1;

        do
        {
            System.out.println("\n===== BIOSKOP ====");

            System.out.println("""
                    1. Create
                    2. Update
                    3. Delete
                    4. Print
                    0. Exit
                    """);

            pilihan = input.nextInt();
            input.nextLine();

            switchMenu(pilihan);
        } while (pilihan !=0);
    }


    private void switchMenu(int menu)
    {
        switch (menu)
        {
            case 1:
                new Create().create();
                break;
            case 2 :
                new Update().update();
                break;
            case 3 :
                new Delete().delete();
                break;
            case 4 :
                print();
                break;
            default:
                System.out.println("GAGAL");
                break;
        }
    }

    public void print ()
    {
        ArrayList<FilmEntity> flmlist = Film.all();
        System.out.println("");
        for (FilmEntity flm : flmlist )
        {
            System.out.println("KODE    : "+flm.getCode());
            System.out.println("JUDUL   : "+flm.getTitle());
            System.out.println("JAM     : "+flm.getAuthor());
            System.out.println("KURSI   : "+flm.getPublisher());
        }
    }
}
