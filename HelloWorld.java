public class HelloWorld {
    public static void mummy(int n) {
        for (int i =0, i < n, i++) {
            System.out.println("Are you my mummy?");
        }
    }

    public static boolean isWhole(double num) {
        if (num-(int)num == 0) {
            return true;
        }
        return false;
    }

    public static double circleArea(double rad) {
        return (rad*Math.PI);
    }

    public static void chickenTaco() {
        for (int i=1,i<=20,i++) {
            for (int j= 0, j<i, j++) {
                System.out.print("Chicken ");
            }
            System.out.println("Taco");
        }
    }
}