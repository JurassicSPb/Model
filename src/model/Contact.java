package model;

/**
 * Created by Юрий on 26.06.2016.
 */
import java.util.ArrayList;

/*
private - доступ к полю/методу возможен только внутри класса,
    в котором создано поле/метод
public - противоположен private, то есть разрешает доступ извне
 */
public class Contact {
    private String name;
    private ArrayList<String> phones = new ArrayList<String>();
    private String email;
    private int age;
    private int numbersCount;

    //Конструктор - это метод, который вызывается единственный раз при создании объекта
    //Конструктор именуется как класс, в котором он создается
    //У конструктора нет и не может быть возвращаемого значения
    public Contact(String name) {
        this.name = name;
    }

    //Конструктор по-умолчанию
    public Contact() {
//        this.id = (int) (Math.random()*100000);
    }

//    public Contact(String phone) {
//        this.name = name;
//    }

    public Contact(int age) {
        this.age = age;
    }

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Contact(int age, String phone) {
        this.phones.add(phone);
        this.age = age;
    }

    /*
    Полиморфизм (перегрузка)
    Условия перегрузки методов:
    1) Количество параметров разное
    2) Разные типы параметров
    3) Порядок типов
     */
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phones.add(phone);
        this.email = email;
    }

    public void print() {
        System.out.println(toString());
//        numbersCount = 3454;
//
//        String name = "Dima";
//
//        send(name);
//
//        this.name
    }

    @Override
    public String toString() {
        String result = name + " " + email;

        if (phones.size() == 1) {
            result += " " + phones.get(0);
        } else {
            result += "\n<=== Phones ===>\n";
            //result += телефоны с переносом строк
        }

        return result;
    }

    //Сеттер
    public void setNumbersCount(int count) {
        numbersCount = count;
    }

//    public void setPhone(String phone) {
////        this.phone = phone;
////    }
//
//        public void setEmail (String email){
//            this.email = email;
//        }

    //Геттер

    public String getName() {
        return name;
    }

    public void addPhone(String phone) {
        phones.add(phone);
    }

    public ArrayList<String> getPhones() {
        return phones;
    }


    //должен вернуть true, если данные this объекта совпадают с another
    @Override
    public boolean equals(Object another) {
        if (another instanceof Contact) {
            Contact contact = (Contact) another;
            return this.name.equals(contact.name);
        } else if (another instanceof User) {
            User user = (User) another;
            return this.name.equals(user.name);
        } else {
            return false;
        }
    }
}