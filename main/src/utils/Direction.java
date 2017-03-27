package utils;

public enum Direction {
    E, W, S, N;

    public static boolean isDirection(String direction) {
        Direction[] dirs = Direction.values();
        for(Direction aDirection: dirs) {
            if(aDirection.name().toLowerCase().equals(direction.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private static void validateDirection(String direction) throws LostCaverException {
        Util.validateCurrentObject(direction);
        if(!isDirection(direction)) {
            throw new LostCaverException("Error: No such direction: " + direction + " !");
        }
    }

    public static Direction convertToDirection(String direction) throws LostCaverException {
        validateDirection(direction);
        return Direction.valueOf(direction.toUpperCase());
    }
}