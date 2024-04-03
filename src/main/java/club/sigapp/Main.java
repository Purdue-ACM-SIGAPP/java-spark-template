package club.sigapp;

import static spark.Spark.*;

/*
 * This is a basic template for a Java backend using Spark.
 * Please read the excellent documentation and tutorials on
 * their website for more details on extending this.
 * 
 * https://sparkjava.com/
 */

public class Main {
    public static void main(String args[]) {
        before("/protected", (request, response) -> {
            /*
             * This is very poor authentication created
             * as an illustration. Please don't use this.
             */
            String password = request.queryMap().get("password").value();
            if (password == null || !password.equals("sigapp")) {
                halt(401, "Unauthorized.");
            }
        });

        get("/", (req, res) -> "Hello world");
        get("/protected", (req, res) -> "You made it in!");
        get("/stop", (req, res) -> { stop(); return "Stopping..."; });
    }
}
