package assets;

import java.awt.Point;
import utils.*;
import character.*;

public class Move {

    public static Caver executeInstruction(Caver caver, String instr) throws LostCaverException {
        Util.validateCurrentObject(caver);
        Instruction instruction = Instruction.convertToInstruction(instr);
        switch(instruction) {
            case M:   caver = moveForward(caver);
                      break;
            case L:   caver = spin90DegLeft(caver);
                      break;
            case R:   caver = spin90DegRight(caver);
                      break;
            default:  Util.printMessage("Congratulations! The caver found the exit successfully!");
                      System.exit(0);
        }
        return caver;
    }

    private static Caver moveForward(Caver caver) throws LostCaverException {
        Util.validateCurrentObject(caver);
        Point position = caver.getPosition();
        int x = (int)position.getX();
        int y = (int)position.getY();
        Direction dir = caver.getDirection();
        switch(dir) {
            case EAST:    x = x + 1;
                          break;
            case WEST:    x = x - 1;
                          break;
            case NORTH:   y = y + 1;
                          break;
            default:      y = y - 1;
                          break;
        }
        caver.setPosition(x, y);
        return caver;
    }

    private static Caver spin90DegRight(Caver caver) throws LostCaverException {
        Util.validateCurrentObject(caver);
        Direction dir = caver.getDirection();
        String nextDir = null;
        switch(dir) {
            case EAST:    nextDir = "SOUTH";
                          break;
            case WEST:    nextDir = "NORTH";
                          break;
            case NORTH:   nextDir = "EAST";
                          break;
            default:      nextDir = "WEST";
                          break;
        }
        caver.setDirection(nextDir);
        return caver;
    }

    private static Caver spin90DegLeft(Caver caver) throws LostCaverException {
        Util.validateCurrentObject(caver);
        Direction dir = caver.getDirection();
        String nextDir = null;
        switch(dir) {
            case EAST:    nextDir = "NORTH";
                          break;
            case WEST:    nextDir = "SOUTH";
                          break;
            case NORTH:   nextDir = "WEST";
                          break;
            default:      nextDir = "EAST";
                          break;
        }
        caver.setDirection(nextDir);
        return caver;
    }

}