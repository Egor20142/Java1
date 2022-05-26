package Lesson2;

public class main {
    public static void main(String[] args) {
        System.out.println(test1(6,6));
        System.out.println(test3(55));
        test4("Egor",15);
    }
    public static boolean test1(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        }
        return false;
    }




    public static void test2(int x) {
        if (x >= 99) {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }

    public static boolean test3(int y) {
        if (y >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void test4(String str, int n) {
        for (int i = 5; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }






















}


