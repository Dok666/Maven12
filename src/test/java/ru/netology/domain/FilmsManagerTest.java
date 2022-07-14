package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
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


    @Test
    public void AddaMovie() {

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

        Afiche[] actual = manager.findAll();
        Afiche[] expected = {first, second, third, fourth, five, six, seven, eight, nine, ten, eleven};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastFilms() {
        FilmsManager manager = new FilmsManager(10);
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


        manager.findLast();

        Afiche[] actual = manager.findLast();
        Afiche[] expected = {eleven, ten, nine, eight, seven, six, five, fourth, third, second};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastFilms1() {

        FilmsManager manager = new FilmsManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(five);
        manager.save(six);
        manager.save(seven);

        manager.findLast();


        Afiche[] actual = manager.findLast();
        Afiche[] expected = {seven, six, five, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindAllFilms() {

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

        Afiche[] actual = manager.findAll();
        Afiche[] expected = {first, second, third, fourth, five, six, seven, eight, nine, ten, eleven};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindAllFilms1() {

        FilmsManager manager = new FilmsManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(five);
        manager.save(six);
        manager.save(seven);

        manager.findAll();

        Afiche[] actual = manager.findAll();
        Afiche[] expected = {first, second, third, fourth, five, six, seven};

        Assertions.assertArrayEquals(expected, actual);
    }
}












