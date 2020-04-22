package learnjava.com;

public class operator {
    public static void main(String[] args) {
        int a=10;
        int b = 20;

//Arthmatic operator
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;

//logical operator
        boolean r = true;

        if (r){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        int m=2;
        if (m%2==0 || m%4==0){
            System.out.println(" && ture");
        }
        else {
            System.out.println("no && false");
        }

//Relational operator
        if(a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println(b+"acc");
        }
        if(a<b){
            System.out.println("a is greater");
        }
        else {
            System.out.println(b+"acc");
        }


//Assingment operator
        if (a==b){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if (a!=b){
            System.out.println(" no equal");
        }
        else {
            System.out.println("equal");
        }


        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(a++);
        System.out.println(a++ + ++a);
        System.out.println(a-- - --a);

    }

}
