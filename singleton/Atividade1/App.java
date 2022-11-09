
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM");
        LocalDateTime date = LocalDateTime.now();
        Random random = new Random();

        String personNames[] = {
                "Eduardo",
                "Juliana",
                "José",
                "Arthur",
        };

        for (int i = 0; i < 10; i++) {
            saque("Saque", date.format(formatter), random.nextInt(1000),
                    personNames[random.nextInt(4)]);
                    deposito("Depósito", date.format(formatter), random.nextInt(1000),
                    personNames[random.nextInt(4)]);
        }

        Log.returnLogs();

    }

    public static void saque(String operation, String date, int value, String personName) {
        Log log = Log.getInstance();
        log.generateLog(operation, date, value, personName);
    }

    public static void deposito(String operation, String date, int value, String personName) {
        Log log = Log.getInstance();
        log.generateLog(operation, date, value, personName);
    }

}
