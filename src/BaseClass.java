import java.util.*;
import model.CodeId;

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

    protected static CodeId getCodeId(String s){
        CodeId codeId = new CodeId();

        try{
            if(s.charAt(0) < 65) throw new NumberFormatException("Must start with A-Y");

            codeId.setKey(s.charAt(0));
            codeId.setRows(Integer.parseInt(s.substring(1,2)));
            
            String posStr = s.substring(2);
            if(posStr.length() == 2){
                codeId.setPositionX(Integer.parseInt(posStr.substring(0,1)));
                codeId.setPositionY(Integer.parseInt(posStr.substring(1,2)));
            }else if(posStr.length() == 4){
                codeId.setPositionX(Integer.parseInt(posStr.substring(0,2)));
                codeId.setPositionY(Integer.parseInt(posStr.substring(2,4)));
            }else{
                throw new NumberFormatException("format error");
            }
            return codeId;
        }catch(NumberFormatException e){
            System.out.println("error command " + e.getMessage());
            return null;
        }
    }
}
