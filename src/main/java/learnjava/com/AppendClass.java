package learnjava.com;

public class AppendClass {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("java is good lang");
        s.delete(2,4);
        System.out.println(s);
        s.deleteCharAt(0);
        System.out.println(s);
        s.append(" hey");
        System.out.println(s);
        s.insert(0,"hello ");
        System.out.println(s);
    }
}
