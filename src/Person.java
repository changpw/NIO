public abstract class Person implements Eat{
    public String name="zszs";
    public   String age;
    public Person(){}
    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public abstract void sleep();
    public abstract void  eat();
    public abstract void  work();
    public void getInfo(){
        System.out.println("MYINFO");
    }


    @Override
    public String toString()   {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
