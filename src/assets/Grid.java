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

    public Point getExit() {
        if(this == null) {
            return null;
        } else {
            return this.exit;
        }
    }

    private static boolean validatePoint(Point point) throws LostCaverException {
        Util.validateCurrentObject(point);
        int x = (int)point.getX();
        int y = (int)point.getY();
        if(x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean validatePoint(int x, int y) {
        if(x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT) {
            return false;
        } else {
            return true;
        }
    }

    public static void validatePointInGrid(Point point) throws LostCaverException {
        if(!Grid.validatePoint(point)) {
            throw new LostCaverException("Error: Given point ("
                + (int)point.getX() + ", " + (int)point.getY() +") is not in Grid!");
        }
    }

    public static void validatePointInGrid(int x, int y) throws LostCaverException {
        if(!Grid.validatePoint(x, y)) {
            throw new LostCaverException("Error: Given point ("
                + x + ", " + y +") is not in Grid!");
        }
    }
}