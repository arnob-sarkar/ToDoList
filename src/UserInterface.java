import java.util.Scanner;
public class UserInterface {
    private ToDoList list;

    private Scanner scanner;

    public UserInterface(ToDoList list ,Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }

    public void start(){

        System.out.println("Enter 'add' to add a task");
        System.out.println("Enter 'remove' to remove a task");
        System.out.println("Enter 'stop' to close the program");
        System.out.println("Enter 'list' to print all the tasks");
        while (true) {
            System.out.print("Command: ");
            String s = scanner.nextLine();
            if (s.equals("stop")) {
                break;
            }
            if (s.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                this.list.add(task);
            }
            if (s.equals("list")) {
                this.list.print();
            }
            if (s.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                this.list.remove(number);
            }



        }
    }
}
