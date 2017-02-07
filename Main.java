import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

    get("/", (req, res) -> "Hello World");
	get("/test", (req, res) -> "Hello World test");

  }

}
