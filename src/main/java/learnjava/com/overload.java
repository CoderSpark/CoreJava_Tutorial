package learnjava.com;

public class overload {
    void add(){
        System.out.println("hey");
    }

    void add(int x){
        int i;
        i=x;
        System.out.println(+i);
    }
}

class overloading{
    public static void main(String[] args) {
        overload ob = new overload();
        ob.add();
        ob.add(10);
    }
}
