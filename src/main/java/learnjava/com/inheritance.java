package learnjava.com;

public class inheritance {
    int i,j;
    void set(int x, int y){
        i=x;
        j=y;
    }
}

class base extends inheritance{
    int total;
    void sum(){
        total=i+j;
    }
}

class hello{
    public static void main(String[] args) {
        base ob = new base();
        ob.set(10,20);
        ob.sum();
        System.out.println(ob.total);
    }
}