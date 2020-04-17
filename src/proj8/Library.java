package proj8;

import java.util.Arrays;

import static java.util.Objects.isNull;

public final class Library {

      Film [] films;
      private final String libraryName;

     {
        films = new Film [5];
        Film f1 = new Film ("Harry Potter", "Fantasy", "150 min");
        Film f2 = new Film ("Fast Furious", "Action", "110");
        films [0] = f1;
        films [1] = f2;
        System.out.println("Добавлены любимые фильмы");
    }

    public Film[] getFilms() {
         return films;
    }

    public String getLibraryName() {
         return libraryName;
    }

    public Library (String libraryName) {
        this.libraryName = libraryName;
        System.out.println("Библиотека " + libraryName + " успешно создана");
    }

    public int getNullPoint (Film[] films) {
        for (int i = 0; i < films.length ; i++) {
            if (isNull(films[i])){
                return i;
            }
        }
        return -1;
    }

    public void add (Film filmName) {
         int index = getNullPoint(this.films);
         if (index == -1) {
             System.out.println("Место закончилось");
             return;
         }
         this.films[index] = filmName;
    }
}
