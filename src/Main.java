import java.util.*;

public class Main{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input command ");
        String command = getCommand(sc);
        
        System.out.println("data: " + command);
    }

    private static String getCommand(Scanner sc){
        return sc.nextLine().toUpperCase();
    }
}
