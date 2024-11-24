package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Класс Lion представляет льва с различными характеристиками.
 * Имплементирует интерфейс Animal.
 */
public class Lion implements Animal {
    private final String name;
    private final int age;
    private final String gender;
    private final String habitat;
    private final String diet;
    private final int speed;

    // Фабричный метод
    public static Lion createLion(String name, int age, String gender, String habitat, String diet, int speed) {
        System.out.println("Создаем объект Lion через фабричный метод");
        return new Lion(name, age, gender, habitat, diet, speed);
    }

    /**
     * Конструктор для создания объекта Lion с указанными параметрами.
     * @param name имя льва
     * @param age возраст льва
     * @param gender пол льва
     * @param habitat место обитания льва
     * @param diet тип питания льва
     * @param speed максимальная скорость льва
     */
    private Lion(String name, int age, String gender, String habitat, String diet, int speed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.habitat = habitat;
        this.diet = diet;
        this.speed = speed;
    }

    /**
     * Метод, который возвращает звук, издаваемый львом.
     */
    @Override
    public void animalSound() {
        System.out.println("Лев " + name + " рычит: Ррр!");
    }

    /**
     * Метод, который возвращает подробную информацию о льве.
     */
    @Override
    public void getInfo() {
        System.out.println("Лев " + name + "\nвозраст: " + age + "\nпол: " + gender + "\nместо обитания: " + habitat +
                "\nпитание: " + diet + "\nскорость: " + speed + " км/ч");
    }

    @PostConstruct
    public void init() {
        System.out.println("Инициализация льва");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Завершение работы с львом");
    }
}