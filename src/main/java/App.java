import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {
        Javalin app = WebSocket.getInstance();
        app.start(7000);
    }
}