package learnjava.com;

public class staticvar {
    int a=10;
    static int b= 5;
    void show(){
        a=a+10;
        b=b+20;
        System.out.println(a);
        System.out.println(b);
    }

}

class statcvar1{
    public static void main(String[] args) {
        staticvar ob = new staticvar();
        ob.show();

        staticvar ob1 = new staticvar();
        ob1.show();
    }
}
