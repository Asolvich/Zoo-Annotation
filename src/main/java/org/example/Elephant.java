package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Класс Elephant представляет слона с различными характеристиками.
 * Имплементирует интерфейс Animal.
 */
public class Elephant implements Animal {
    private final String name;
    private final int age;
    private final String gender;
    private final String habitat;
    private final String diet;
    private final int weight;

    // Фабричный метод
    public static Elephant createElephant(String name, int age, String gender, String habitat, String diet, int weight) {
        System.out.println("Создаем объект Elephant через фабричный метод");
        return new Elephant(name, age, gender, habitat, diet, weight);
    }

    /**
     * Конструктор для создания объекта Elephant с указанными параметрами.
     * @param name имя слона
     * @param age возраст слона
     * @param gender пол слона
     * @param habitat место обитания слона
     * @param diet тип питания слона
     * @param weight вес слона
     */
    private Elephant(String name, int age, String gender, String habitat, String diet, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.habitat = habitat;
        this.diet = diet;
        this.weight = weight;
    }

    /**
     * Метод, который возвращает звук, издаваемый слоном.
     */
    @Override
    public void animalSound() {
        System.out.println("Слон " + name + " трубит: Ууу!");
    }

    /**
     * Метод, который возвращает подробную информацию о слоне.
     */
    @Override
    public void getInfo() {
        System.out.println("Слон " + name + "\nвозраст: " + age + "\nпол: " + gender + "\nместо обитания: " + habitat +
                "\nпитание: " + diet + "\nвес: " + weight + " кг");
    }

    @PostConstruct
    public void init() {
        System.out.println("Инициализация слона");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Завершение работы с слоном");
    }
}
