package learnjava.com;

abstract class abstractclass {
    abstract void son();
    void child(){
        System.out.println("sub");
    }
}

abstract class abstractclass1 extends abstractclass{
    void son(){
        System.out.println("son");
    }
    abstract void parent();
}
class abstractclass2 extends abstractclass1{
    void parent(){
        System.out.println("parrent");
    }
}

class abstractclass4{
    public static void main(String[] args) {
        abstractclass2 ob = new abstractclass2();
        ob.parent();
        ob.child();
        ob.son();
    }
}