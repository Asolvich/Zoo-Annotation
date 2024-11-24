package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource("classpath:zoo-prop.properties")
public class ZooConfig {
    /**
     * Конфигурационный класс Spring для настройки компонентов зоопарка.
     * Аннотация @Configuration указывает, что данный класс содержит определения бинов.
     * Аннотация @ComponentScan указывает Spring, где искать компоненты для автоматического создания бинов.
     */

    @Bean
    public Lion lion(
            @Value("${lion.name}") String name,
            @Value("${lion.age}") int age,
            @Value("${lion.gender}") String gender,
            @Value("${lion.habitat}") String habitat,
            @Value("${lion.diet}") String diet,
            @Value("${lion.speed}") int speed) {
        return Lion.createLion(name, age, gender, habitat, diet, speed);
    }

    @Bean
    public Elephant elephant(
            @Value("${elephant.name}") String name,
            @Value("${elephant.age}") int age,
            @Value("${elephant.gender}") String gender,
            @Value("${elephant.habitat}") String habitat,
            @Value("${elephant.diet}") String diet,
            @Value("${elephant.weight}") int weight) {
        return Elephant.createElephant(name, age, gender, habitat, diet, weight);
    }

    // Бин ZooKeeper, использующий объект Lion
    @Bean
    public ZooKeeper zooKeeperForLion(@Qualifier("lion") Animal lion) {
        return new ZooKeeper(lion);
    }

    @Bean
    public ZooKeeper zooKeeperForElephant(@Qualifier("elephant") Animal elephant){
        return new ZooKeeper(elephant);
    }

}
