import java.util.*;

public class BaseClass{
    protected static void println(String msg) {
        System.out.println(msg);
    }
    protected static void print(String msg){
        System.out.print(msg);
    }
    protected static String getCommand(Scanner sc){
        return sc.nextLine().toUpperCase();
    }
}
