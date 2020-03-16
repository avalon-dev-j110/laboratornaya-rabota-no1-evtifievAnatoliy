/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
OK
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
*OK!!!!!!!!!
 */

package ru.avalon.java.dev.j10.labs.commons;
public class Address {
    
    private String contry;
    private String region;
    private String street;
    private String house;
    private int flat;

    public Address(String contry, String region, String street, String house, int flat) {
        this.contry = contry;
        this.region = region;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return contry + ", " + region + ", " + street + ", дом " + house + ", квартира " + flat + ".";
    }

    
    
}
