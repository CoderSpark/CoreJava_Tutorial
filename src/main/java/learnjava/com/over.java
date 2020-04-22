package learnjava.com;
// overridden method
public class over {
    void disp(){
        int a=20;
        System.out.println(a);
    }
}

class over1 extends over{
    void disp(){
        int c=2;
        System.out.println(c);
    }
}

class over2{
    public static void main(String[] args) {
        over1 ob = new over1();
        ob.disp();
    }
}
