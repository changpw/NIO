import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
    * 多态针对方法来说编译看左边，运行看右边
    * 针对属性来说都是左边
    * */
    public static void main(String[] args) {
        System.out.println("***********");
        Student student  = new Student();
        Person person = student;
        Student student1 = (Student) person;
        System.out.println(person.name);
        System.out.println(person instanceof  Person);
        System.out.println(student.hashCode());
        System.out.println(person.hashCode());
        System.out.println(student1.hashCode());
        person.eat();
//        Person doctor = new Doctor("zs","15");
//        System.out.println(doctor.toString());

        HashMap<String, Object> stringStringHashMap = new HashMap<>();
        HashMap<String, Object> stringStringHashMaps = new HashMap<>();
        stringStringHashMap.put("s",'1');
        System.out.println(stringStringHashMap.get("s").equals('1'));
        String s="117天";
        System.out.println(s.substring(0,s.length()));
        ArrayList<Map<String, String>> arrayList = new ArrayList<>();
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("String","String");
        arrayList.add(stringHashMap);
        stringStringHashMaps.put("Map",arrayList);
        System.out.println(stringStringHashMaps.toString());
        List<Map<String,String>> map = (List<Map<String,String>>)stringStringHashMaps.get("Map");
        Map<String, String> stringStringMap = map.get(0);
        stringStringMap.put("String","00001");
        System.out.println(stringStringHashMaps.toString());
        System.out.println(student.getColor());
        System.out.println(Eat.getRed());

    }
}

