class Student {
    String name;
    String course;
    int age;

    public void prinnfn() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(); 
        Student s2 = new Student();

        s1.name = "anshu";
        s1.age = 21;
        s1.course = "MCA";
        
        s2.name = "johnSnow";
        s2.age = 21;
        s2.course = "MCA";

        s1.prinnfn();
        s2.prinnfn();
    }
}
