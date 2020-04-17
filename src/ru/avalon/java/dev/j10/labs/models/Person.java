package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;
//import ru.avalon.java.dev.j10.labs.commons.*;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными; 
 *     <li>пропиской по месту жительства.
 * </ol>
 */

public class Person {
    
    private String surname;
    private String name;
    private String middleName;
    private String secondName;
    private String birthdayDate;
    private Passport passport; 
    private Address address;

     public Person(String surname, String name, String middleName, String secondName, String birthdayDate) {
        //to check
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.secondName = secondName;
        this.birthdayDate = birthdayDate;
    }
     
    public Person(String surname, String name, String middleName, String secondName, String birthdayDate, Address address) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.secondName = secondName;
        this.birthdayDate = birthdayDate;
        this.address = address;
 
    }
    
    public Person(String surname, String name, String middleName, String secondName, String birthdayDate, Passport passport) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.secondName = secondName;
        this.birthdayDate = birthdayDate;
        this.passport = passport;
    }
    
    public Person(String surname, String name, String middleName, String secondName, String birthdayDate, Passport passport, Address address) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.secondName = secondName;
        this.birthdayDate = birthdayDate;
        this.passport = passport;
        this.address = address;
    }


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSecondName() {
        return secondName;
    }
    
    
    
    
    
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     * OK!!!!!!!!!
     */
    
    
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        if (this.surname!=null && this.name!=null && this.middleName!=null)
            return this.surname + " " + this.name + " " + this.middleName;
        else if (this.surname!=null && this.name!=null && this.middleName==null && this.secondName!=null)
            return this.surname + " " + this.name + " " + this.secondName.substring(0, 1).toUpperCase() + ".";
        else if (this.surname!=null && this.name!=null && this.middleName==null && this.secondName==null)
            return this.surname + " " + this.name;
        
        else
           return null;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
   
    
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address.toString();
    }
}