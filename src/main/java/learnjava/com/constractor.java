package learnjava.com;

public class constractor {
    int a;

    constractor(){
        System.out.println("hello");
         a=20;
    }
    void display(){
        System.out.println(+a);
    }

}

class con{
    public static void main(String[] args) {
        constractor ob = new constractor();
        ob.display();


    }
}
