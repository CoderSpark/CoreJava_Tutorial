package learnjava.com;

public class paraconstructor {
    int b;
    paraconstructor(int a){
        b=a;
    }
    void dis(){
        System.out.println(b);
    }
}

class paraconstructor2{
    public static void main(String[] args) {
        paraconstructor ob = new paraconstructor(10);
        ob.dis();
    }
}
