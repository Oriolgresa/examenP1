package edu.upc.eetac.dsa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            Singleton.getInstance().addUser("oriol", "bcn", 1234);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
