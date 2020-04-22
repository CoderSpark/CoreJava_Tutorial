package learnjava.com;

public class finalkey {
   final int a=10;
    void showimg(){
        final int b=20;
        int c= b+10;
        System.out.println(a);
    }
}

class finalk{
    public static void main(String[] args) {
        finalkey ob = new finalkey();
        ob.showimg();
    }
}
