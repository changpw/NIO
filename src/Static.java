/*
*
* 静态方法只能调用静态属性和静态方法
*
* */

import java.sql.SQLOutput;

public class Static {
    public  static String name="zs";
    public static void main(String[] args) {
//        Static.print();
//        System.out.println(name);
//        NoStatic noStatic = new NoStatic();
//        noStatic.print();
//        Circle circle = new Circle(100);
//        System.out.println(circle.getId());
//        for (String str:args) {
//            System.out.println(str);
//        }
        StaticBlock.staticMethod();
        StaticBlock staticBlock = new StaticBlock();
        StaticBlock.staticMethod();
        staticBlock.Method();
//        StaticBlock staticBlock1 = new StaticBlock();
//        StaticBlock staticBlock2 = new StaticBlock();

    }
    public static void print(){
        System.out.println(name);
    }

}

/*
* 非静态方法可以调用静态和非静态属性和方法
*
* 通常将公共属性声明为静态属性、将工具类中的方法声明为静态方法
* */
class NoStatic{

    public  void print(){
        Static.print();
    }
}
class Circle{
    private  int radius;
    private  int  id;
    private  static int initId=1000;
    public Circle(){
        this.id=initId+1;
    }
    public Circle(int radius){
       this();
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
/*
* 静态代码块在类加载时执行类加载一次执行一次
* 代码块随着对象生成时执行，对象生成次执行多次
*
* */
class StaticBlock{
    static {
        System.out.println("Static block");
    }
    {
        System.out.println(" block");

    }
    public  void Method() {
        System.out.println("Method");
    }
        public static void staticMethod(){
        System.out.println("staticMethod");
    }



}
