package utils;

import utils.*;

public class Util {
    public static void validateCurrentObject(Object obj) throws LostCaverException {
        if(obj == null) {
            throw new LostCaverException("Error: Current object does not exist!");
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}