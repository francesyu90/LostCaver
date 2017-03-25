package character;
import utils.Direction;
import java.awt.Point;
import utils.*;
import assets.*;

public class Caver {

    private Point position;
    private Direction dir;

    /**
     *  Checks if a given string is valid direction
     *  @param direction A given string to check if it is a valid direction
     *  @return Throws exception if it is not valid direction
     */
    private void validateDirection(String direction) throws LostCaverException {
        Util.validateCurrentObject(direction);
        if(!Direction.isDirection(direction)) {
            throw new LostCaverException("Error: No such direction: " + direction + " !");
        }
    }

    /**
     *  Checks if a given point is in grid
     *  @param point A given point to check if it is in grid
     *  @return Throws exception if it is not in grid
     */
    private void validatePointInGrid(Point point) throws LostCaverException {
        if(!Grid.validatePoint(point)) {
            throw new LostCaverException("Error: Given point ("
                + (int)point.getX() + ", " + (int)point.getY() +") is not in Grid!");
        }
    }

    /**
     *  Checks if a given point is in grid
     *  @param x X coordinate
     *  @param y Y coordinate
     *  @return Throws exception if it is not in grid
     */
    private void validatePointInGrid(int x, int y) throws LostCaverException {
        if(!Grid.validatePoint(x, y)) {
            throw new LostCaverException("Error: Given point ("
                + x + ", " + y +") is not in Grid!");
        }
    }

    public Caver() {
        this.position = new Point(0, 0);
        this.dir = Direction.DEFAULT;
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
        Util.validateCurrentObject(this);
        validateDirection(direction);
        this.dir = Direction.valueOf(direction.toUpperCase());
    }

    public void setPosition(Point point) throws LostCaverException {
        Util.validateCurrentObject(this);
        validatePointInGrid(point);
        this.position = point;
    }

    public void setPosition(int x, int y) throws LostCaverException {
        Util.validateCurrentObject(this);
        validatePointInGrid(x, y);
        this.position = new Point(x, y);
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
            + (int)this.position.getY() + ")" + this.dir.name().charAt(0);
        return coorAndDir;
    }


}