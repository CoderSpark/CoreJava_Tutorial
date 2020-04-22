package learnjava.com;

public class superkey {
    int a;
    void showcase(){
        System.out.println("parent class");
    }
}

class superkey2 extends superkey{
    int a;
    void showcase(){
        System.out.println("sub class");
    }
    void msg(){
        showcase();
        super.showcase();
    }
}
class superkey1{
    public static void main(String[] args) {
        superkey2 ob = new superkey2();
        ob.msg();
    }
}
