package LabWork19;

import java.util.Scanner;

public class InnVerification {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter INN number: ");
            try (Scanner scanner = new Scanner(System.in)) {
                String inn = scanner.nextLine();
                isInnValid(inn);
                break;
            } catch (NotValidInnException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("INN is valid!");
    }

    public static boolean isInnValid(String inn) throws NotValidInnException {
        if (inn == null || inn.length() != 12) {
            throw new NotValidInnException(inn);
        }
        return true;
    }
}