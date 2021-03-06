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
                case "-t":  Util.getUserInputAndProcessInstructions();
                            break;
                default:
                    throw new LostCaverException("Warning: Invalid number of arguments. " +
                        "usage: ./main.sh -f [filename] or ./main.sh -t");

            }


        } catch (Exception e) {
            Util.printMessage(e.getMessage());
        }


	}
}
