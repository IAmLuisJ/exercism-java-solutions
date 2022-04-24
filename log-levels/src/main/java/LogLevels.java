import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        String message = logLine.substring(logLine.indexOf(":")+1);
        return message.trim();
    }

    public static String logLevel(String logLine) {
        int levelStart = logLine.indexOf("[")+1;
        int levelEnd = logLine.indexOf("]");
        String level = logLine.substring(levelStart, levelEnd);
        return level.toLowerCase(Locale.ROOT);
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        return message + " ("+level + ")";
    }
}
