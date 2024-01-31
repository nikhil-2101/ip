import java.util.Scanner;
import java.util.ArrayList;

public class Duke {
    public static void main(String[] args) {{
            System.out.println("____________________________________________________________");

            Scanner scanner = new Scanner(System.in);
            ArrayList<String> tasks = new ArrayList<>();

            while (true) {
                String userInput = scanner.nextLine();

                if ("bye".equalsIgnoreCase(userInput)) {
                    break;
                }

                System.out.println("____________________________________________________________");
                System.out.println(userInput);
                System.out.println("____________________________________________________________");
                if ("list".equalsIgnoreCase(userInput)) {
                    System.out.println("____________________________________________________________");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    System.out.println("____________________________________________________________");
                } else {
                    System.out.println("____________________________________________________________");
                    System.out.println("added: " + userInput);
                    System.out.println("____________________________________________________________");
                    tasks.add(userInput);
                }
            }

            System.out.println("____________________________________________________________");