public class HelloWorld {
    public static void main() {
        
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
        for(int i = 0; i < num; i++) {
            String str = "";
            if (num % 3 == 0) {
                str = str + "Fizz";
            }
            if (num % 5 == 0) {
                str = str + "Buzz";
            }
            if (str.equals("")) {
                System.out.println(String.valueOf(num));
            } else {
                System.out.println(str);
            }
        }
    }
}