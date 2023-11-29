package LabWork24;

public class MagicalChair implements Chair {
    public void doMagic() {
        System.out.println("Magic!");
    }

    @Override
    public String getChairType() {
        return "Magic";
    }
}