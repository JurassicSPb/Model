package model;


/**
 * Created by Юрий on 26.06.2016.
 */
public class User implements Comparable<User>{
    protected String name;
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        //если this == o то возвращаем 0
        return this.name.compareTo(o.name);
    }
}