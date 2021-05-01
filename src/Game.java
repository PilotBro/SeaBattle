

public class Game {
    public static void main(String[] args) {
        Battlefield battlefield = new Battlefield();

        System.out.println("Добро пожаловать в игру \"Морской бой\"!\n" +
                "Начинаем расстановку кораблей. Второй игрок, отвернись!");

        System.out.println("Введите координаты четырехпалубного корабля(в формате: x,y;x,y;x,y;x,y;):");
        battlefield.setWarship(WarshipType.FOUR_DECK);

        System.out.println("Введите координаты первого трехпалубного корабля(в формате: x,y;x,y;x,y;):");

        System.out.println("Введите координаты второго трехпалубного корабля(в формате: x,y;x,y;x,y;):");

        System.out.println("Введите координаты первого двухпалубного корабля(в формате: x,y;x,y;):");

        System.out.println("Введите координаты второго двухпалубного корабля(в формате: x,y;x,y;):");

        System.out.println("Введите координаты третьего двухпалубного корабля(в формате: x,y;x,y;):");

        System.out.println("Введите координаты первого однопалубного корабля(в формате: x,y;):");

        System.out.println("Введите координаты второго однопалубного корабля(в формате: x,y;):");

        System.out.println("Введите координаты третьего однопалубного корабля(в формате: x,y;):");

        System.out.println("Введите координаты четвертого однопалубного корабля(в формате: x,y;):");

    }
}
