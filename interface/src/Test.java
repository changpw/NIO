import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;


public class Test {

    public static void main(String[] args) {
        Person person = new Person("zs", 15);
        Person person1 = new Person("ls", 22);
        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person1);
        Person [] staff= new Person[2];
        staff[0]=person;
        staff[1]=person1;
        Arrays.sort(staff);
        for (Person person2: staff) {
            System.out.println(person2);
        }
        JOptionPane.showMessageDialog(null,"Hello");
        Toolkit.getDefaultToolkit().beep();

        String [] arr ={"1","2","55","14"};

        Arrays.sort(arr, (String m,String n) -> Integer.compare(Integer.parseInt(m),Integer.parseInt(n)));
        for (String string: arr) {
            System.out.println(string);
        }
    }

}
