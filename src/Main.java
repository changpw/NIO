public class Main {
    public static void main(String[] args) {
        System.out.println("***********");
        Person student = new Student("tom","11","math");
        System.out.println(student.toString());
        Person doctor = new Doctor("zs","15");
        System.out.println(doctor.toString());

    }
}

