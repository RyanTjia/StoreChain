import io.javalin.Javalin;

public class WebSocket {
	
	public static Javalin getInstance() {
		Javalin app = Javalin.create();
		app.get("/", ctx -> {
			ctx.result("Hello World");
		});

		return app;
	}
}