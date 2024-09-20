// In a program, input the side of a square. You have to output the area of the square
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a*b;
        System.out.println("Area of square is: " + area)
    }
}