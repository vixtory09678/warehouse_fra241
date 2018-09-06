import java.util.*;
import model.*;

public class Main extends BaseClass {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        print("input command ");
        String command = getCommand(sc);
        CodeId codeId = getCodeId(command);

        if (codeId != null) {
            println("key: " + codeId.getKey());
            println("rows: " + codeId.getRows());
            println("posX: " + codeId.getPositionX());
            println("posY: " + codeId.getPositionY());
        }

    }

}
