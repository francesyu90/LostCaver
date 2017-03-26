package character;

import assets.*;
import character.*;
import utils.*;
import java.awt.Point;
import java.util.Random;

public class Partner {

    public static String generateInstruction(Grid grid, Caver caver) throws LostCaverException {
        Util.validateCurrentObject(grid);
        Util.validateCurrentObject(caver);

        Point cPos = GPS.getCaverPosition(caver);
        Direction cDir = GPS.getCaverDirection(caver);
        Point exit = grid.getExit();

        String instruction = null;
        Random rand = new Random();
        int inst = 0;

        if(cPos.getX() == exit.getX() && cPos.getY() < exit.getY()) {
            switch(cDir) {
                case E:  instruction = "L";
                            break;
                case W:  instruction = "R";
                            break;
                case N: inst = rand.nextInt(2) + 1;
                            if(inst == 1) {
                                instruction = "L";
                            } else {
                                instruction = "R";
                            }
                            break;
                default:    instruction = "M";
                            break;
            }
        } else if(cPos.getY() == exit.getY() && cPos.getX() < exit.getX()) {
            switch(cDir) {
                case E:  instruction = "M";
                            break;
                case W:  inst = rand.nextInt(2) + 1;
                            if(inst == 1) {
                                instruction = "L";
                            } else {
                                instruction = "R";
                            };
                            break;
                case N: instruction = "R";
                            break;
                default:    instruction = "L";
                            break;
            }
        } else if(cPos.getX() < exit.getX() && cPos.getY() < exit.getY()) {
            inst = rand.nextInt(3);
            switch(inst) {
                case 0:     instruction = "M";
                            break;
                case 1:     instruction = "L";
                            break;
                default:    instruction = "R";
                            break;

            }
        } else if(cPos.getX() == exit.getX() && cPos.getY() == exit.getY()) {
            instruction = "D";
        } else {
            throw new LostCaverException("Error: Cannot generate instruction for current coordinates [(" +
                (int)cPos.getX() + ", " + (int)cPos.getY() + ")] of the Caver and exit [(" +
                (int)exit.getX() + ", " + (int)exit.getY() + ")]");
        }

        return instruction;
    }

}