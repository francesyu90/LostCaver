package utils;

public enum Direction {
    EAST, WEST, SOUTH, NORTH, DEFAULT;

    public static boolean isDirection(String direction) {
        Direction[] dirs = Direction.values();
        for(Direction aDirection: dirs) {
            if(aDirection.name().toLowerCase().equals(direction.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}