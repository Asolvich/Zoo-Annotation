# Zoo-Annotation
Java application for showing how Spring dependencies works (using annotation and configuration class).

## Описание
Простое Java приложение для демонстрации работы с Spring зависимостями (Используя аннотации и класс-конфигурации).

## Сборка и запуск

### Требования
- Java 17 (или выше)
- Maven 3.6.0 (или выше)
  
### Сборка
Чтобы собрать приложение, необходимо выполнить следующие действия:
1. Скопируйте репозиторий.
2. Откройте папку с проектом.
3. Откройте консоль в этой папке и введите команду:
```cmd
mvn clean package
```

### Запуск
После выполнения команды откройте папку *target* и выполните команду:
```cmd
java -jar Java-Zoo-V2-1.0-SNAPSHOT.jar
```

## Документация

### Задачи
Необходимо создать приложение, в котором будут объявлены Spring-конфигурации при помощи аннотаций и класса-конфигурации. 
Снабдить спроектированные классы init- и destroy- методами, а также использовать фабричный метод для любого из классов.
В каждом варианте есть сущность (класс), необходимо создать интерфейс (самостоятельно на усмотрение студента) и классы, его имплементирующие. 
Объекты классов, имплементирующих данный интерфейс, будут передаваться в качестве зависимостей. Выполнить связывание и получить объекты из контекста. Продемонстрировать результаты в простейшем консольном приложении.

#### Должно содержать:

1. Внедрение простых значений через конструктор;
2. Внедрение зависимости по ссылке через конструктор;
3. Интерфейс содержит методы;
4. Классы, имплементирующие интерфейс, содержат как минимум одно поле (у разных классов - разные);
5. Зависимый класс должен содержит метод, который на основе вызова метода у зависимости выводил бы некоторое сообщение в консоль (Например для класса Автомобиля, в который внедряются Двигатели. Они могут выдавать свою мощность, а автомобиль может выводить сообщение, с какой скоростью он может двигаться);
6. Внедрение простых значений из внешнего файла через setter.

### Реализовано
Во время работы приложения был создан класс конфигурации (ZooConfig), который использует Spring для определения и настройки всех необходимых бинов. 
В рамках конфигурации был применен фабричный метод для создания объектов двух классов: Lion и Elephant.

#### Описание классов
- **Class ZooConfig** это класс конфигурации в Spring, который определяет и настраивает бины для контекста приложения с использованием аннотаций, таких как @Configuration, @Bean и @ComponentScan.
- **Interface Animal:** Интерфейс, от которого наследуются все классы животных, имеет два метода (<i>animalSound(), getInfo()</i>).
- **Class Elephant:** Класс слона, который имплементирует интерфейс **Animal**. Имеет **уникальное поле:** weight.
- **Class Lion:** Класс льва, который имплементирует интерфейс **Animal**. Имеет **уникальное поле:** speed.
- **Class ZooKeeper:** Класс отвечает за взаимодействие с животными, получает животное в качестве зависимости и вызывает методы для вывода информации и звуков животных.
- **Class Main:** Главный класс, который демонстрирует работу программы.

### Описание ресурсов
- **zoo-prop.properties:** файл свойств, используемый для хранения простых значений конфигурации в формате ключ = значение.
