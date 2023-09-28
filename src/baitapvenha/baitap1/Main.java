package baitapvenha.baitap1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass=new MyClass("Phan Trọng Hùng");
        System.out.println("giá trị ban đầu là: "+myClass.getMyClass());
        myClass.setMyClass("Nguyễn Văn A");
        System.out.println("giá trị sau là: "+myClass.getMyClass());
    }
}
