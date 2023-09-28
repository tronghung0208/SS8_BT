package baitap;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, int age, String programmingLanguage) {
        super(id, name, age);
        this.programmingLanguage = programmingLanguage;
    }
    public void work(){
        super.work();
        System.out.println("Đây là developer");
    }
    public void fixbug(){
        System.out.println("Đang fixbug");
    }
}
