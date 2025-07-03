package level_1.manager;

import level_1.model.Command;

import java.util.Stack;

public class UndoManager {

    private static UndoManager instance;
    private final Stack<Command> commandHistory;

    private UndoManager() {
        commandHistory = new Stack<>();
    }

    public static UndoManager getInstance() {
        if (instance == null) {
            synchronized (UndoManager.class) {
                if (instance == null) {
                    instance = new UndoManager();
                }
            }
        }
        return instance;
    }

    public void addCommand(Command command) {
        commandHistory.push(command);
        System.out.println("Command added.");
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command removed = commandHistory.pop();
            System.out.println("Undone command: " + removed.getCommand());
        } else {
            System.out.println("No commands to undo.");
        }
    }

    public void listCommands() {
        if (commandHistory.isEmpty()) {
            System.out.println("No commands in history.");
            return;
        }
        for (int i = commandHistory.size() - 1; i >= 0; i--) {
            System.out.println((commandHistory.size() - i) + ". " + commandHistory.get(i).getCommand());
        }
    }
}