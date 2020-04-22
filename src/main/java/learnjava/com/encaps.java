package learnjava.com;

public class encaps {
    private int a;
    private int b;
    void set(int ab){
        a=ab;
    }
    public int get(){
        return a;
    }

}
class pqr{
    public static void main(String[] args) {
        encaps ob = new encaps();
        ob.set(2);
        ob.get();
        System.out.println(ob.get());
    }
}
