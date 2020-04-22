package learnjava.com;

public class exceptionhandle {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("doesnot divied by 0");
        }
        }
}
