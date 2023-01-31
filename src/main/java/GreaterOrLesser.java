
public class GreaterOrLesser {
    /**
     * Let's say part of a calculator app has to judge whether one number is bigger than another. This problem will
     * require you to use an if/else statement.
     *
     * @param a first number to be compared.
     * @param b second number to be compared.
     * @return  If a is less than b, return the string "Lesser". if a is greater than b, return "Greater".
     *          If neither is true, return "Equal". This problem is case-sensitive!
     */
    public static void main(String[] args){
        int a = 5, b = 5;
        String res = decide(a, b);
        System.out.println(res); 
    }
    public static String decide(int a, int b){
        if (a > b){
            return "Greater";
        }
        else if (a < b){
            return "Lesser";
        }
        else{
            return "Equal";
        }
    }
}