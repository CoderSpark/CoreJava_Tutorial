package learnjava.com;

public class multipleinheri {
    void show(){
        System.out.println("hello");
    }

    public void start() {
    }
}

interface def{
    int a=100;
    void show1();
}

class multipleinheri1 extends multipleinheri implements def{
    public void show1(){
        System.out.println("hey");
    }
}

class multipleinheri2{
    public static void main(String[] args) {
        multipleinheri1 ob = new multipleinheri1();
        ob.show1();
        ob.show();
    }
}