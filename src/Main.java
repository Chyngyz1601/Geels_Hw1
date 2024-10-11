import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String mallHome;
        int NUM = 5;
        String word = "РАБОТА";
        mallHome = NUM + word;
        System.out.println(mallHome);
        System.out.println(word);
        System.out.println(NUM);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else if (NUM == 0) {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Ведите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Привет" + username + "!");

    }
}