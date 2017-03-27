package assets;

import character.*;
import utils.*;
import java.awt.Point;

public class GPS {

    public static Point getCaverPosition(Caver caver) throws LostCaverException {
        Util.validateCurrentObject(caver);
        return caver.getPosition();
    }

    public static Direction getCaverDirection(Caver caver) throws LostCaverException {
        Util.validateCurrentObject(caver);
        return caver.getDirection();
    }

}