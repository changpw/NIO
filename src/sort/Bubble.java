package sort;

import java.util.*;

public class Bubble {
    public static void main(String[] args) {
//        int [] arr ={1,55,66,44,22,5,88,2,5,3,7};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr.length-i-1 ; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        for (int num: arr) {
//            System.out.print(num+"\t");
//        }


        //利用比较器将map按照map中的指定字段排序；
        List<Map<String, String>> list = new ArrayList();
        Map<String, String> map = new HashMap();
        map.put("id", "20");
        Map<String, String> map1 = new HashMap();
        map1.put("id", "40");
        Map<String, String> map2 = new HashMap();
        map2.put("id", "10");
        list.add(map);
        list.add(map1);
        list.add(map2);
     Collections.sort(list, new Comparator<Map<String, String>>() {
         @Override
         public int compare(Map<String, String> o1, Map<String, String> o2) {
             String name1 =o1.get("id");
             String name2=o2.get("id");

             return name1.compareTo(name2);
         }
     });
        Iterator<Map<String, String>> iterator = list.iterator();
        while (iterator.hasNext()) {
            Map<String, String> maps = iterator.next();
            System.out.println(maps.toString());

        }
    }
}
