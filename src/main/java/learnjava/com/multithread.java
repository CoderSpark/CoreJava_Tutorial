package learnjava.com;

public class multithread extends Thread {
    public void run(){
        for (int i=0; i<5;i++){
            System.out.println("hello");
        }
    }
}

class multithread1 extends Thread{
    public void run(){
        for (int i=0; i<5;i++){
            System.out.println("hey");
        }
    }
}

class multi{
    public static void main(String[] args) {
        multithread ob = new multithread();

        multithread1 ob1 = new multithread1();
        ob.start();
        ob1.start();
    }
}