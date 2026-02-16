class Student18 implements Cloneable {

    int rollno;
    String name;

    Student18(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void show() {
        System.out.println("Rollno: " + rollno + " Name: " + name);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student18 s1 = new Student18(16, "anshu");
            Student18 s2 = (Student18) s1.clone();

            s1.show();
            s2.show();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}
