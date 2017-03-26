import java.awt.Point;
import java.util.*;

import assets.*;
import utils.*;
import character.*;


public class LostCaver {


    public static void main(String[] args) {

        try {
            String flag = args[0];
            switch(flag) {
                case "-f":  String filename = args[1];
                            ArrayList<String> instructions = Util.getInstructionsFromUserInput(filename);
                            Util.processInstructionsFromFile(instructions);
                            break;
                case "-t": break;
                default:
                    throw new LostCaverException("Warning: Invalid number of arguments. " +
                        "usage: ./test.sh -f [filename] or ./test.sh -t");

            }


        } catch (Exception e) {
            Util.printMessage(e.getMessage());
        }


	}
}
