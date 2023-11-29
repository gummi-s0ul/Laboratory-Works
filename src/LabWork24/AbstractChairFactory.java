package LabWork24;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);

    MagicalChair createMagicChair();

    FunctionalChair createFunctionalChair();
}
