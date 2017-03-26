package character;
import utils.Direction;
import java.awt.Point;
import utils.*;
import assets.*;

public class Caver {

    private Point position;
    private Direction dir;

    public Caver() {
        this.position = new Point(0, 0);
        this.dir = Direction.EAST;
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
        Grid.validatePointInGrid(point);
        this.position = point;
    }

    public void setPosition(int x, int y) throws LostCaverException {
        Util.validateCurrentObject(this);
        Grid.validatePointInGrid(x, y);
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





