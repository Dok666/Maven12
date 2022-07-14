


package ru.netology.domain;

public class FilmsManager {
    private Afiche[] films = new Afiche[0];

    private int limit;


    public FilmsManager() {
        limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;

    }


    public void save(Afiche film) {
        Afiche[] tmp = new Afiche[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;

        films = tmp;
    }


    public Afiche[] findAll() {
        return films;
    }

    public Afiche[] findLast() {

        Afiche[] recent = new Afiche[limit];
        if (limit < films.length) {
            recent = new Afiche[limit];
        } else {
            recent = new Afiche[films.length];

        }
        for (int i = 0; i < recent.length; i++) {
            recent[i] = films[films.length - i - 1];

        }
        return recent;
    }

}

