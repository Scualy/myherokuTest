import static spark.Spark.*;

public class Main {
  public static void main(String[] args) {
    port(Integer.valueOf(System.getenv("PORT")));
    get("/", (req, res) -> "Hello World");
	get("/test", (req, res) -> "Hello World test");
  get("/test2", (req, res) -> "Hello World test");
  }
}
