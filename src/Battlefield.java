import java.io.IOException;
import java.util.Scanner;

public class Battlefield {
    public Cell[][] battlefieldPrima;
    public Cell[][] battlefieldSecondo;
    Scanner scanner = new Scanner(System.in);

    public Battlefield() {
        battlefieldPrima = new Cell[10][10];
        battlefieldSecondo = new Cell[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            }
        }
    }

    public void setWarship (WarshipType type) {
        while (scanner.hasNextLine()) {
            String coordinates = scanner.next();
            switch (type) {
                case FOUR_DECK -> {
                    if (coordinates.matches("(\\d,\\d;){4}")) {
                        String[] coordinatesArray = coordinates.split("[,;]+");
                        return;
                    } else {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Введенные координаты не верны. Попробуй еще раз.");

                        }
                    }
                }
                case THREE_DECK -> {
                    if (coordinates.matches("(\\d,\\d;){3}")) {
                        String[] coordinatesArray = coordinates.split("[,;]+");
                        return;
                    } else {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Введенные координаты не верны. Попробуй еще раз.");

                        }
                    }
                }
                case TWO_DECK -> {
                    if (coordinates.matches("(\\d,\\d;){2}")) {
                        String[] coordinatesArray = coordinates.split("[,;]+");
                        return;
                    } else {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Введенные координаты не верны. Попробуй еще раз.");

                        }
                    }
                }
                case ONE_DECK -> {
                    if (coordinates.matches("(\\d,\\d;)")) {
                        String[] coordinatesArray = coordinates.split("[,;]+");
                        return;
                    } else {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Введенные координаты не верны. Попробуй еще раз.");

                        }
                    }
                }
            }
        }

    }
}
