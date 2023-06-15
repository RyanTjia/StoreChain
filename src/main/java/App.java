import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {
        Javalin app = WebSocket.getInstance();

        //Starts at port 8080
        app.start(8080);
    }
}