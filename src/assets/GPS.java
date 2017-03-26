package assets;

import character.*;
import utils.*;
import java.awt.Point;

public class GPS {

    Caver caver;

    public GPS(Caver caver) throws LostCaverException {
        Util.validateCurrentObject(caver);
        this.caver = caver;
    }

    public Point getCaverPosition() throws LostCaverException {
        Util.validateCurrentObject(this);
        return this.caver.getPosition();
    }

    public Direction getCaverDirection() throws LostCaverException {
        Util.validateCurrentObject(this);
        return this.caver.getDirection();
    }

}