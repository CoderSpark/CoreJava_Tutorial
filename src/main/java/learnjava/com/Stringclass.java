package learnjava.com;

public class Stringclass {
    public static void main(String[] args) {
        String a = "paddy";
        String ob = new String("paddu");
        System.out.println(ob);
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        char ov[] = {'p','a','d','d','y'};
        String ob1 = new String(ov);
        System.out.println(ob1);

        String d=" will";
        String c= "smith";
        String e = c+" happy"+d;
        String g = d.concat("paddy");
        System.out.println(g);
    }
}
