
package ru.netology.domain;


public class Main {

    public static void main(String[] args) {

        Afiche first = new Afiche(12, "Бладшот", "Боевик");
        Afiche second = new Afiche(13, "Вперед", "Мультфильм");
        Afiche third = new Afiche(14, "Отель Белград", "Комедия");
        Afiche fourth = new Afiche(15, "Джентельмены", "Комедия");
        Afiche five = new Afiche(16, "Человек невидимка", "Ужасы");
        Afiche six = new Afiche(17, "Тролли", "Мультфильм");
        Afiche seven = new Afiche(18, "Номер один", "Комедия");
        Afiche eight = new Afiche(19, "Терминатор", "Боевик");
        Afiche nine = new Afiche(20, "Матрица", "Фантастика");
        Afiche ten = new Afiche(21, "Колобок", "Мультфильм");
        Afiche eleven = new Afiche(22, "Спартак", "Боевик");

        FilmsManager manager = new FilmsManager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(five);
        manager.save(six);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);
        manager.save(ten);
        manager.save(eleven);

        manager.findAll();

        manager.findLast();
    }
}


