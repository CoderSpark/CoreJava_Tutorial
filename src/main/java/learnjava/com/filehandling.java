package learnjava.com;

import  java.io.*;
public class filehandling {
    public static void main(String[] args) throws IOException {
        String str = "paddy zanwar";
        FileWriter t = new FileWriter("/home/paddy/output2.txt");
        t.write(str);
        System.out.println("successfully");
        try {
            t.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
