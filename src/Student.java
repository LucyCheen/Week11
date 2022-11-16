public class Student {
    private String name;
    private int id;
    private int age;
    private String calssName;

    public Student(String name, int id, int age, String calssName) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.calssName = calssName;
    }
    public void  sit(){
        System.out.println("Sitting...");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void learn(){
        System.out.println("Learn in " + this.calssName);

    }
}
