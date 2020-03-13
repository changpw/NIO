public class Doctor extends Person implements Work {
    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getBigNumber() {
        return 0;
    }

    public Doctor(String name, String age) {
        super(name, age);
    }
    @Override
    public void sleep() {
        System.out.println("DOCTOR sleep");
    }

    @Override
    public void eat() {
        System.out.println("DOCTOR eat");

    }

    @Override
    public void work() {
        System.out.println("DOCTOR work");

    }

    @Override
    public void UpWork() {
        System.out.println("DOCTOR UpWork");

    }

//    @Override
//    public String toString() {
//        return "Doctor{}";
//    }
}
