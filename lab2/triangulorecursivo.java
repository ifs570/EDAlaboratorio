import java.util.*;
public class lab2 {
public static void main(String[] args) {
trianguloRecursivo(base);
}
public static void triangulorecursivo(int b) {
if (b == 1) {
System.out.println("*");
} else {
trianguloRecursivo(b - 1);
for (int i = 0; i < b; i++) {
System.out.println("*");
}
System.out.println();
}
}
}
