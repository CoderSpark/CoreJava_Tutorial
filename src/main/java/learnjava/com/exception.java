package learnjava.com;

import java.io.IOException;

public class exception {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        try {
            int c = a*b;
            if (c>300){
                throw new  ArithmeticException();
            }
            else {
                System.out.println(c);

            }
            }
        catch (ArithmeticException e){

        }
        System.out.println("hey");

    }
}
