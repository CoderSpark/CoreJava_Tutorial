package learnjava.com;

public class polymorphism {
    void add(){
        System.out.println("no para");
    }
    void add(int x){

        System.out.println("para"+x);
    }
    void add(int x, int y){

        System.out.println("para" + x + y);
    }
}

class poly{
    public static void main(String[] args) {
        polymorphism ob = new polymorphism();
        ob.add();
        ob.add(10);
        ob.add(10,20);
    }
}
