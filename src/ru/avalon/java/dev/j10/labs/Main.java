package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     *ОК!!
     */
    public static void main(String[] args) {

        System.out.println("Evtifiev first lab");
        

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        Person ivanov = new Person("Иванов", "Иван", "Иванович", null, null,
                new Address("Россия","Санкт-Петербург","улица Вавиловых","11", 89));
        
        Person smith = new Person("John", "Edvard", null, "Smith", null,
                new Address("USA","Detroit","Six Aveny","541Y", 15));
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         */
        String ivanovFullName = ivanov.getFullName();
        System.out.println(ivanovFullName);
        
         /* 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        String smithFullName = smith.getFullName();
        System.out.println(smithFullName);
        
         /* 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         */
        String ivanovAdress =  ivanov.getAddress();
        System.out.println("Адрес Иванова: " + ivanovAdress);
                 
         /* 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        String smithAdress =  smith.getAddress();
        System.out.println("Адрес Смита: " + smithAdress);
         
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
