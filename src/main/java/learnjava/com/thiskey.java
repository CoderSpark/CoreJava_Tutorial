package learnjava.com;

public class thiskey {
    int a,b;
    void setdata(int a, int b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println(+a);
        System.out.println(+b);
    }
}

class thiskey1{
    public static void main(String[] args) {

        thiskey ob = new thiskey();
        ob.setdata(10,20);
        ob.show();
    }
}
