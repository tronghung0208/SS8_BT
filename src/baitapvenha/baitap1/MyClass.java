package baitapvenha.baitap1;

public class MyClass {
    private String myClass;

    public MyClass() {
    }

    public MyClass(String myClass) {
        this.myClass = myClass;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    public String toString(){
        return "MyClass [name=" + myClass + "]";
    };
}
