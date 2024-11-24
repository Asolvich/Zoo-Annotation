package org.example;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Класс ZooKeeper отвечает за взаимодействие с животными в зоопарке.
 * Он получает животное в качестве зависимости и вызывает методы для вывода информации и звуков животных.
 */
@Component
public class ZooKeeper {
    private Animal animal;  // Зависимость от объекта Animal
    /**
     * Конструктор ZooKeeper, принимающий животное в качестве параметра.
     * @param animal объект, представляющий животное (имплементирует интерфейс Animal).
     */
    @Autowired
    public ZooKeeper(@Qualifier("lion") Animal animal) {
        this.animal = animal;
    }

    /**
     * Метод, который выводит звук животного в консоль.
     */
    public void makeAnimalSound() {
        animal.animalSound();
    }

    /**
     * Метод, который выводит подробную информацию о животном в консоль.
     */
    public void showAnimalInfo() {
        animal.getInfo();
    }
}
