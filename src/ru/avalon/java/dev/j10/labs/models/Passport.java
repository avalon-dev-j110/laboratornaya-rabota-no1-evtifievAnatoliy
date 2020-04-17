package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    
    private String passportNumber;
    private String issureDate;
    private String issure;

    public Passport(String passportNumber, String issureDate, String issure) {
        this.passportNumber = passportNumber;
        this.issureDate = issureDate;
        this.issure = issure;
    }
    
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

    public String getPassportNumber() {
        return passportNumber;
    }

   
    public String getIssureDate() {
        return issureDate;
    }

    public String getIssure() {
        return issure;
    }

    @Override
    public String toString() {
        return "Passport{" + "Паспорт:" + passportNumber + ", выданный" + issureDate + " года, выдан: " + issure + '}';
    }

    

    

}
