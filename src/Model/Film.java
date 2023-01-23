package Model;

import Entity.FilmEntity;

import java.util.ArrayList;

public class Film
{
    private static ArrayList<FilmEntity> film = new ArrayList<>();


    public static void create(FilmEntity filmm)
    {
        film.add(filmm);
    }

    public static void update (FilmEntity filmm)
    {
        film.set(indexOf(filmm.getCode()), filmm );
    }

    public static void remove(String code)
    {
        film.remove(indexOf(code));
    }

    public static ArrayList<FilmEntity> all()
    {
        return film;
    }

    public static FilmEntity search(String code)
    {
        for (FilmEntity flm : film)
        {
            if (flm.getCode().equals(code))
                return flm;
        }
        return null;
    }

    public static int indexOf(String code)
    {
        FilmEntity flm = search(code);
        return film.indexOf(flm);

    }
}

