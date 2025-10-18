package ru.oop.task3;

/**
 * Интерфейс транспорта
 *
 * @author Daniil Mezev
 */
public interface Vehicle extends Positioned {

    /**
     * Передвигаться на средстве передвижения пока есть возможность
     */
    void moveTo(Person person, Position destination);

}
