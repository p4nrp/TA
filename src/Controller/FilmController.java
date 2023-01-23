package Controller;

import Entity.FilmEntity;
import Model.Film;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class FilmController
{
    public void create(String code, String title, String author, String publisher )
    {
        Film.create(new FilmEntity(code,title,author,publisher));
    }

    public void update(String code, String title, String author, String publisher )
    {
        Film.update(new FilmEntity(code,title,author,publisher));
    }

    public void delete(String code)
    {
        Film.remove(code);
    }

    public FilmEntity search(String code)
    {
        return Film.search(code);
    }

    public ArrayList<FilmEntity> getFilm(){return Film.all();}

    public DefaultTableModel listdata()
    {
        DefaultTableModel listdata = new DefaultTableModel();
        Object[] kolom = {"Code", "Nama Film" , "Jam Tayang" , "Kursi"};

        listdata.setColumnIdentifiers(kolom);

        for (int i = 0; i < getFilm().size(); i++)
        {
            Object[] data = new Object[4];
            data[0] = getFilm().get(i).getCode();
            data[1] = getFilm().get(i).getTitle();
            data[2] = getFilm().get(i).getAuthor();
            data[3] = getFilm().get(i).getPublisher();

            listdata.addRow(data);
        }
        return listdata;
    }
}
