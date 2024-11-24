package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Класс Main запускает Spring-приложение, которое демонстрирует работу с зоопарком.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ZooConfig.class);

        ZooKeeper zooKeeperForLion = context.getBean("zooKeeperForLion", ZooKeeper.class);
        // Выводим звук животного
        zooKeeperForLion.makeAnimalSound();
        // Выводим информацию о животном
        zooKeeperForLion.showAnimalInfo();

        System.out.println("");

        ZooKeeper zooKeeperForElephant = context.getBean("zooKeeperForElephant", ZooKeeper.class);
        // Выводим звук животного
        zooKeeperForElephant.makeAnimalSound();
        // Выводим информацию о животном
        zooKeeperForElephant.showAnimalInfo();

        context.close();
    }
}