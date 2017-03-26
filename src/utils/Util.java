package utils;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Point;
import java.io.*;

import utils.*;
import character.*;

public class Util {
    public static void validateCurrentObject(Object obj) throws LostCaverException {
        if(obj == null) {
            throw new LostCaverException("Error: Current object does not exist!");
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessages(ArrayList<String> messages) {
        for(String message: messages) {
            printMessage(message);
        }
    }

    public static ArrayList<String> getInstructionsFromUserInput(String fileName) throws IOException, LostCaverException {
        validateCurrentObject(fileName);
        String line = null;
        FileReader fileReader =  new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> instructions = new ArrayList<String>();

        while((line = bufferedReader.readLine()) != null) {
                String instruction = line.replaceAll("[\\s+(),]","");
                boolean isValidInstruction = instruction.matches("^[0-9][0-9][EWSN][MRLD]*$");
                if(isValidInstruction) {
                    instructions.add(instruction);
                }
        }

        bufferedReader.close();
        fileReader.close();
        if(instructions.size() == 0) {
            throw new LostCaverException("Error: there is no valid instruction available!");
        }
        return instructions;
    }

    public static void processInstructionsFromFile(ArrayList<String> instructions) throws LostCaverException {
        validateCurrentObject(instructions);
        for(String instruction: instructions) {
            Scanner scanner = new Scanner(instruction).useDelimiter("\\s*");;
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            String dir = scanner.next();
            Caver caver = new Caver(x, y, dir);
            printMessage("Initial position: " + caver.toStr());
            ArrayList<String> instrSet = new ArrayList<String>();
            while(scanner.hasNext()) {
                instrSet.add(scanner.next());
            }
            caver.executeInstructions(instrSet);
        }
    }

}






