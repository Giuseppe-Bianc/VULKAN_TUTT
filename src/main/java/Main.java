import it.unibas.vulkanttt.APP;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("inizio app");
        APP a = APP.getInstance();
        a.run();
    }
}