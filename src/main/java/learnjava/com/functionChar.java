package learnjava.com;
//#charAt()
public class functionChar {
    public static void main(String[] args) {//012354
        StringBuffer s = new StringBuffer("java is good lang");
        char c = s.charAt(3);
        System.out.println(c);

        s.setCharAt(0,'l');
        System.out.println(s);
    }

}

