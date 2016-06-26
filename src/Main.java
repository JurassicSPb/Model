/**
 * Created by Юрий on 26.06.2016.
 */
    import model.User;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Contact c = new Contact("Vasya","353453","ghfghfgdfg");
//        Contact c2 = new Contact("Dima", "79997774433", "blabla@mail.ru");
//        new Contact(22, "423345");
//        new Contact("Dima", 34);
//        new Contact();
//
//        int numbersCount = 0;
////        ...
//        numbersCount = 3243430;
//        c.setNumbersCount(3230); //c.numbersCount = 3230;
////        ...
//
////        c.setName("gdfgdfh");
//
//        System.out.println(c.getName());
//
////        c.string();

//        User user = new User();

//        user.getAge();
//        user.getName();

//        UserFriend friend = new UserFriend();
//
//        friend.getPhone();
//        friend.getEmail();
//        friend.getName();
//        friend.getAge();

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Vova", 22));
        users.add(new User("Dima", 24));
        users.add(new User("Nik", 19));

        //по алфавиту
        Collections.sort(users);
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }

        Comparator<User> compUserByAge = new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getAge() - u2.getAge();
            }
        };
//        Comparator<User> comp = (u1, u2) -> {
//            //сравниваем age u1 и u2
//            return 0;
//        };

        Collections.sort(users, compUserByAge);
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName() + " " + users.get(i).getAge());
        }


//        User u = new UserFriend("sdfsdf", 8);
//        Comparable<User> c = new UserFriend("dfgdfg", 90);
//        Serializable s = new User("5345", 434);

        //У одного класса может быть сколько угодно наследников
        //У одного наследника может быть только один родитель
    }

    /*
    1) private, public, protected, default (нет модификатора)
        - особенности относительно пакетов
    2) Создать иерархию классов геометрических фигур (2D)
        Shape2D - в этом классе поля и методы общие для всех фигур
        MultiAngle - класс - родитель всех фигур с углами
        Rectangle
        Triangle
        Square
        Circle
        Oval
     */
}