import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("current time is  " + ZonedDateTime.now() + "!");
        System.out.println("current local time is  " + LocalDateTime.now() + "!");
    }
}
