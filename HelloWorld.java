public class HelloWorld {
    public static void main(String[] args) {
        fizzBuzz(20);
    }
    public static String princessBride() {
        return "Hello. My name is Inigo Montoya. You killed my father. Prepare to die.";
    }
    public static boolean isBestSport(String sport) {
        if (sport.equalsIgnoreCase("soccer")) {
            return true;
        } else {
            return false;
        }
    }
    public static void fizzBuzz(int num) {
        for(int i = 0; i <= num; i++) {
            String str = "";
            if (i % 3 == 0) {
                str = str + "Fizz";
            }
            if (i % 5 == 0) {
                str = str + "Buzz";
            }
            if (str.equals("")) {
                System.out.println(String.valueOf(i));
            } else {
                System.out.println(str);
            }
        }
    }
    public static int iLoveYou() {
        return 3000;
    }
}