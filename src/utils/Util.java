package utils;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Point;
import java.io.*;

import utils.*;
import character.*;
import assets.*;

public class Util {

    private static int max_number_of_execution = 200;

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

    public static void getUserInputAndProcessInstructions() throws LostCaverException {
        Scanner sc = new Scanner(System.in);
        printMessage("Please enter x coordinate: ");
        int x = sc.nextInt();
        printMessage("Please enter y coordinate: ");
        int y = sc.nextInt();
        printMessage("Please enter the initial direction: ");
        String direction = sc.next();
        Caver caver = new Caver(x, y, direction);
        printMessage("Initial position: " + caver.toStr());
        Grid grid = new Grid();
        printMessage(grid.toStr());
        String instruction = null;
        int counter = 0;
        while(!(instruction = Partner.generateInstruction(grid, caver)).equals("D") && counter <= max_number_of_execution) {
            caver.executeInstruction(instruction);
            counter++;
        }
        if(instruction.equals("D")) {
            Util.printMessage("Result: Congratulations! The caver found the exit successfully!");
        } else {
            Util.printMessage("Result: The caver did not find the exit. Please try again!");
        }

    }

}






