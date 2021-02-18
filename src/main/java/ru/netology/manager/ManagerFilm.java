package ru.netology.manager;

import ru.netology.domain.Film;

public class ManagerFilm {
    private Film[] items = new Film[0];
    private int quantityTape = 10; //juhfybxtybz

    public void add(Film item) {
        // создаём новый массив размером на единицу больше

        //  int length = quantityTape;
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    //
    public Film[] getAll() {
        if (items.length <= quantityTape) {
            Film[] result = new Film[items.length];
            for (int i = 0; i < items.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        } else {
            Film[] result = new Film[quantityTape];
            for (int i = 0; i < quantityTape; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }

    // наивная реализация
    public void removeById(int id) {
        int length = items.length - 1;
        Film[] tmp = new Film[length];
        int index = 0;
        for (Film item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        // меняем наши элементы
        items = tmp;
    }
}

