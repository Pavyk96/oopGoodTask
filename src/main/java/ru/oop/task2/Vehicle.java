package ru.oop.task2;

/**
 * Транспорт
 *
 * @author Daniil Mezev
 */
public interface Vehicle extends Positioned {

    /**
     * Передвигаться на средстве передвижения пока есть возможность
     */
    void moveTo(Person person, Position destination);

}
