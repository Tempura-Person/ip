public class Ui {
    protected String logo = " ____        _        \n"
            + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n"
            + "| |_| | |_| |   <  __/\n"
            + "|____/ \\__,_|_|\\_\\___|\n";
    protected String border = "_________________________________________\n";

    public Ui() {
        // Welcome message upon initialisation of new Ui
        System.out.println("Hello from\n" + logo);
        System.out.println(border + "Sup, Duke here.\nWhat do you want from me?\n" + border);
    }

    public void print(String toFormat){
        System.out.println(border + toFormat + "\n" + border);
    }

    public String formatMessage(String toFormat){
        return border + toFormat + "\n" + border;
    }

    public String formatLogicError(String message){
        return "\n" + border + "[ERROR]\nUh, " + message + "\n" + border;
    }

    public String formatCommandError(String command, String format){
        return "\n" + border + "[ERROR]\nUh, " + command + " command format is used wrongly." +
               "\nCorrect format is as follows:\n" + "[ " + format + " ]\n" + border;
    }
}
