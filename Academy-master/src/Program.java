import jdk.jfr.DataAmount;
import jdk.jfr.Name;

import java.util.ArrayList;
@Name("kambarov")
@DataAmount("11/12/2004 ")
public class Program {

    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));// получаем 2-й объект




            System.out.println(1);
        }
    }
