public class HelloWorldf {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        String a = "10";
        String b = "3";

        System.out.println("hello");

//        x + y results in a sum of numbers
        System.out.println(x + y);

//        a + b is a String concatenation
//        x is evaluated as a String because this println starts with concatenation
        System.out.println(a + " and " + b + x);
    }
}
