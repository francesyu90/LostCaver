package assets;

import java.awt.Point;
import java.util.Random;
import utils.*;

public class Grid {
    public static final int WIDTH = 20;
    public static final int HEIGHT = 16;
    private final Point exit;

    public Grid() {
        Random rand = new Random();
        int x = rand.nextInt(WIDTH);
        int y = rand.nextInt(HEIGHT);
        this.exit = new Point(x, y);
    }

    /**
     * Returns where the exit is
     * @return The exit
     */
    public Point getExit() {
        if(this == null) {
            return null;
        } else {
            return this.exit;
        }
    }

    /**
     *  Check if a given point is in the grid
     *  @param point Next position of the Caver
     *  @return True if the given point is in the grid; False otherwise
     */
    public static boolean validatePoint(Point point) throws LostCaverException {
        Util.validateCurrentObject(point);
        int x = (int)point.getX();
        int y = (int)point.getY();
        if(x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *  Check if a given point is in the grid
     *  @param x X coordinate
     *  @param y Y coordinate
     *  @return True if the given point is in the grid; False otherwise
     */
    public static boolean validatePoint(int x, int y) {
        if(x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT) {
            return false;
        } else {
            return true;
        }
    }
}