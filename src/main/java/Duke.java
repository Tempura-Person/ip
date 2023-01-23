import java.util.Scanner;

import Features.DukeException;
import Features.Parser;
import Features.Storage;
import Features.TaskList;
import Features.Ui;

public class Duke {

    public static void main(String[] args) {

        // initialise storage, taskList and loop objects
        Storage dukeSave = new Storage();
        TaskList taskList = dukeSave.loadTaskList();
        boolean loopEnd = false;

        // initialise Scanner
        Scanner userScan = new Scanner(System.in);
        // welcome message
        new Ui().welcome();


        // while LoopEnd = true loop to accept user input
        while (!loopEnd) {
            // try block to catch DukeException and prevent program from terminating itself.
            try {
                Parser parser = new Parser(userScan, taskList);
                parser.parse();
                taskList = parser.updateTaskList();
                loopEnd = parser.updateLoopEnd();
            } catch (DukeException ex) {
                // error message can be formatted in many possible ways beforehand, so println is used.
                System.out.println(ex.printErrorMessage());
            }

        }
    }
}

