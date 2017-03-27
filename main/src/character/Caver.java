package character;

import java.awt.Point;
import java.util.ArrayList;

import utils.*;
import assets.*;

public class Caver {

    private Point position;
    private Direction dir;

    public Caver() {
        this.position = new Point(0, 0);
        this.dir = Direction.E;
    }

    public Caver(String direction) throws LostCaverException {
        setDirection(direction);
        this.position = new Point(0, 0);
    }

    public Caver(Point point, String direction) throws LostCaverException {
        setDirection(direction);
        setPosition(point);

    }

    public Caver(int x, int y, String direction) throws LostCaverException {
        setDirection(direction);
        setPosition(x, y);

    }

    public void setDirection(String direction) throws LostCaverException {
        this.dir = Direction.convertToDirection(direction);
    }

    public void setPosition(Point point) throws LostCaverException {
        Util.validateCurrentObject(this);
        try {
            Grid.validatePointInGrid(point);
            this.position = point;
        } catch(LostCaverException lostCaverException) {
            throw new LostCaverException("Result: The Caver died because it fell off the edges of the cave!");
        }
    }

    public void setPosition(int x, int y) throws LostCaverException {
        Util.validateCurrentObject(this);
        try {
            Grid.validatePointInGrid(x, y);
            this.position = new Point(x, y);
        } catch(LostCaverException lostCaverException) {
            throw new LostCaverException("Result: The Caver died because it fell off the edges of the cave!");
        }
    }

    public Point getPosition() throws LostCaverException {
        Util.validateCurrentObject(this);
        return this.position;
    }

    public Direction getDirection() throws LostCaverException {
        Util.validateCurrentObject(this);
        return this.dir;
    }

    public String toStr() throws LostCaverException {
        Util.validateCurrentObject(this);
        String coorAndDir = "(" + (int)this.position.getX() + ", "
            + (int)this.position.getY() + ")" + this.dir.name();
        return coorAndDir;
    }

     public void executeInstructions(ArrayList<String> instrs) throws LostCaverException {
        Util.validateCurrentObject(this);
        Util.validateCurrentObject(instrs);
        for(String instruction: instrs) {
            executeInstruction(instruction);
        }
    }

    public void executeInstruction(String instr) throws LostCaverException {
        Util.validateCurrentObject(this);
        Util.validateCurrentObject(instr);
        Instruction instruction = Instruction.convertToInstruction(instr);
        switch(instruction) {
            case M:   moveForward();
                      break;
            case L:   spin90DegLeft();
                      break;
            case R:   spin90DegRight();
                      break;
            default:  Util.printMessage("Result: Congratulations! The caver found the exit successfully!");
                      return;
        }
        Util.printMessage(toStr());
    }

    private void moveForward() throws LostCaverException {
        Util.validateCurrentObject(this);
        int x = (int)this.position.getX();
        int y = (int)this.position.getY();
        switch(this.dir) {
            case E:    x = x + 1;
                          break;
            case W:    x = x - 1;
                          break;
            case N:    y = y + 1;
                          break;
            default:   y = y - 1;
                          break;
        }
        setPosition(x, y);
    }

    private void spin90DegRight() throws LostCaverException {
        Util.validateCurrentObject(this);
        String nextDir = null;
        switch(this.dir) {
            case E:    nextDir = "S";
                          break;
            case W:    nextDir = "N";
                          break;
            case N:   nextDir = "E";
                          break;
            default:      nextDir = "W";
                          break;
        }
        setDirection(nextDir);
    }

    private void spin90DegLeft() throws LostCaverException {
        Util.validateCurrentObject(this);
        String nextDir = null;
        switch(this.dir) {
            case E:    nextDir = "N";
                          break;
            case W:    nextDir = "S";
                          break;
            case N:   nextDir = "W";
                          break;
            default:      nextDir = "E";
                          break;
        }
        setDirection(nextDir);
    }


}





