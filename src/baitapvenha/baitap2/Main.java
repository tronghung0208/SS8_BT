package baitapvenha.baitap2;

public class Main {
    public static void main(String[] args) {
        double circle1Area = StaticMethod.calculateCircleArea(3.5);
        double circle2Area = StaticMethod.calculateCircleArea(6);

        // Tính diện tích hình tam giác có các cạnh
        double triangle1Area = StaticMethod.calculateTriangleArea(3, 4, 5);
        double triangle2Area = StaticMethod.calculateTriangleArea(4.5, 7, 6);

        // Tính diện tích hình chữ nhật có kích thước
        double rectangle1Area = StaticMethod.calculateRectangleArea(2.5, 6);
        double rectangle2Area = StaticMethod.calculateRectangleArea(4, 7);

        // Hiển thị kết quả
        System.out.println("Diện tích hình tròn có bán kính 3.5: " + circle1Area);
        System.out.println("Diện tích hình tròn có bán kính 6: " + circle2Area);

        System.out.println("Diện tích hình tam giác 1: " + triangle1Area);
        System.out.println("Diện tích hình tam giác 2: " + triangle2Area);

        System.out.println("Diện tích hình chữ nhật 1: " + rectangle1Area);
        System.out.println("Diện tích hình chữ nhật 2: " + rectangle2Area);
    }
}
