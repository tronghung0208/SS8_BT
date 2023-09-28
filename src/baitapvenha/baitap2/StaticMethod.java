package baitapvenha.baitap2;

public class StaticMethod {
    // Phương thức tính diện tích hình tròn
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Phương thức tính diện tích hình tam giác bằng công thức Heron
    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Phương thức tính diện tích hình chữ nhật
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
