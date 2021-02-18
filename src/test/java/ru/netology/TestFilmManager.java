package ru.netology;


import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import ru.netology.manager.ManagerFilm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestFilmManager {

    @Test
    public void shouldRemoveIfExists() {
        ManagerFilm manager = new ManagerFilm();
        // int idToRemove = 1;
        Film first = new Film(1, "Бладшот", "https://netology.ru/", "Боевик");
        Film second = new Film(2, "Вперед", "https://netology.ru/", "Мультфильм");
        Film third = new Film(3, "Отель Белград", "https://netology.ru/", "Комедия");
        Film fourth = new Film(4, "Джентельмены", "https://netology.ru/", "Боевик");
        Film fifth = new Film(5, "Номер один", "https://netology.ru/", "Комедия");
        Film sixth = new Film(6, "Человек-невидимка", "https://netology.ru/", "Ужасы");
        Film seventh = new Film(7, "Хищник", "https://netology.ru/", "Боевик");
        Film eighth = new Film(8, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(9, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(10, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(11, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(12, "Тьма", "https://netology.ru/", "Сериал");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);

    }

    //если фильмов больше чем лимит ленты выводим лимит
    @Test
    public void shouldExists() {
        ManagerFilm manager = new ManagerFilm();
        //  int idToRemove = 4;
        Film first = new Film(1, "Бладшот", "https://netology.ru/", "Боевик");
        Film second = new Film(2, "Вперед", "https://netology.ru/", "Мультфильм");
        Film third = new Film(3, "Отель Белград", "https://netology.ru/", "Комедия");
        Film fourth = new Film(4, "Джентельмены", "https://netology.ru/", "Боевик");
        Film fifth = new Film(5, "Номер один", "https://netology.ru/", "Комедия");
        Film sixth = new Film(6, "Человек-невидимка", "https://netology.ru/", "Ужасы");
        Film seventh = new Film(7, "Хищник", "https://netology.ru/", "Боевик");
        Film eighth = new Film(8, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(9, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(10, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(11, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(12, "Тьма", "https://netology.ru/", "Сериал");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth,
                fifth, fourth, third}; //,second,first};

        assertArrayEquals(expected, actual);
    }

    //если фильмов меньше чем лимит ленты выводим что есть
    @Test
    public void shouldExists2() {
        ManagerFilm manager = new ManagerFilm();
        //  int idToRemove = 4;

        Film eighth = new Film(1, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(2, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(3, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(4, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(5, "Тьма", "https://netology.ru/", "Сериал");


        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        // manager.removeById(idToRemove);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{twelve, eleventh, tenth, ninth, eighth}; //,seventh,sixth,
        // fifth,fourth,third}; //,second,first};

        assertArrayEquals(expected, actual);
    }

    // удаляем 1 фильм
    @Test
    public void shouldExists3() {
        ManagerFilm manager = new ManagerFilm();
        int idToRemove = 4;

        Film eighth = new Film(1, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(2, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(3, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(4, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(5, "Тьма", "https://netology.ru/", "Сериал");

        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.removeById(idToRemove);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{twelve, tenth, ninth, eighth}; //,seventh,sixth,
        // fifth,fourth,third}; //,second,first}; eleventh,

        assertArrayEquals(expected, actual);
    }
}
