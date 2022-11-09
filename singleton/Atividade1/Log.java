import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Log {

	private static Log log = new Log();
	private static List<String> logs = new ArrayList<>();

	private Log() {
	}

	public static Log getInstance() {
		return log;
	}

	public void generateLog(String operation, String date, int value, String personName) {
		String log = "Log: " + date + " - " + operation + " - " + personName + " - " + value;
		logs.add(log);
	}

	public static void returnLogs() {
		for (int i = 0; i < logs.size(); i++) {
			System.out.println(logs.get(i));
			System.out.println("");
		}
	}

}