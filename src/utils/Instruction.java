package utils;

import utils.*;

public enum Instruction {
    M, R, L, DONE;

    public static boolean isInstruction(String instruction) throws LostCaverException {
        Util.validateCurrentObject(instruction);
        Instruction[] instructions = Instruction.values();
        for(Instruction aInstruction: instructions) {
            if(aInstruction.name().toLowerCase().equals(instruction.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private static void validateInstruction(String instruction) throws LostCaverException {
        Util.validateCurrentObject(instruction);
        if(!isInstruction(instruction)) {
            throw new LostCaverException("Error: No such instruction: " + instruction + " !");
        }
    }

    public static Instruction convertToInstruction(String instruction) throws LostCaverException {
        validateInstruction(instruction);
        return Instruction.valueOf(instruction.toUpperCase());
    }
}