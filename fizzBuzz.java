public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        for (int i = 1; i <= 100; i++) {
            String temp = "";
            if (i % 3 == 0) {
                temp += "fizz";
            }
            if(i % 5 == 0) {
                temp += "buzz";
            }
            if(i % 3 != 0 && i % 5 != 0) {
                temp = Integer.toString(i);
            }
            System.out.println(temp);
        }
     }
}
