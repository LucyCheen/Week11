public class SchoolTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Chihua",152273,42,"JAVA");
        Teacher t2 = new Teacher("Kevin",100002,50,"Deep Learning");
        Student s1 = new Student("David",51021001,19,"JAVA");
        Student s2 = new Student("Howard",51021002,20,"JAVA");

        t1.teach();
        t2.teach();
        s1.learn();
        s2.learn();
    }
}
