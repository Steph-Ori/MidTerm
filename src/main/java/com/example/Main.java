package com.example;
import io.javalin.Javalin;



public class Main {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {

        var app = Javalin.create(config -> {
            config.routes.get("/", ctx -> {
               int n = Integer.parseInt(ctx.queryParam("n"));
                int result = fibonacci(n);
                ctx.result("The " + n + "th term of the Fibonacci sequence is: " + result);
            });
        }).start(7070);
    }
} // End Main
