package LabWork3WrapperClasses;

public class Task1 {
    public static void main(String[] args) {
        Double double1 = Double.valueOf("4.28");
        Double double2 = Double.valueOf(1);

        Double parseDouble = Double.parseDouble("17.04");

        Float floatInst = double1.floatValue();
        Integer intInst = double1.intValue();
        Long longInst = double1.longValue();
        Short shortInst = double1.shortValue();
        Byte byteInst = double1.byteValue();

        System.out.println("Object value double1: " + double1);

        String stringInst = Double.toString(3.14);
        System.out.println("String value obtained from Double: " + stringInst);
    }
}
