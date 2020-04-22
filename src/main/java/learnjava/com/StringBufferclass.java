package learnjava.com;

public class StringBufferclass {
    public static void main(String[] args) {
        StringBuffer ob = new StringBuffer("java");
        System.out.println(ob.length());
        System.out.println(ob.capacity());
        ob.append(" hey");
        System.out.println(ob);

    }

}
//
//String class create immutable object
//StringBuffer class create mutable object