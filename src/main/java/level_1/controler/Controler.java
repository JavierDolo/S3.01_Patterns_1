package level_1.controler;


import level_1.manager.UndoManager;
import level_1.model.Command;
import level_1.utils.InputHelper;

public class Controler {

    private final UndoManager undoManager = UndoManager.getInstance();

    public void startProgram() {
        showMenu();
    }

    public void showMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add command");
            System.out.println("2. Undo last command");
            System.out.println("3. List commands");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int option = InputHelper.getIntInput();

            switch (option) {
                case 1 -> addCommand();
                case 2 -> undoManager.undo();
                case 3 -> undoManager.listCommands();
                case 4 -> exit = true;
                default -> System.out.println("Invalid option.");
            }
        }
        System.out.println("End of program.");
    }

    private void addCommand() {
        System.out.print("Enter a command: ");
        String input = InputHelper.getStringInput();
        undoManager.addCommand(new Command(input));
    }
}