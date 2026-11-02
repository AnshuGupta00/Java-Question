class Object_cloning implements Cloneable {

    int rollno;
    String name;

    Object_cloning(int rollno, String name) {
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
            Object_cloning s1 = new Object_cloning(16, "anshu");
            Object_cloning s2 = (Object_cloning) s1.clone();

            s1.show();
            s2.show();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}
