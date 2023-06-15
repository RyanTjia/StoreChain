import io.javalin.Javalin;

import Services.FileServices;

public class WebSocket {
	
	public static Javalin getInstance() {
		Javalin app = Javalin.create();
		FileServices fileServices = new FileServices();

		app.get("/", ctx -> {
			ctx.result("Hello World");
		});

		app.get("/html", ctx -> {
			ctx.html(fileServices.returnStaticHTML("hello.html"));
		});

		app.post("/test", ctx -> {
			String input = ctx.body();
			ctx.result(input);
		});

		app.get("/end", ctx -> {
			app.stop();
		});

		return app;
	}
}