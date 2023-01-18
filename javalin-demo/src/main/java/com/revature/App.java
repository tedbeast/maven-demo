package com.revature;

import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create();
        app.get("/", ctx -> ctx.result("Hello World"));
        app.start(7071);
    }
}
/**
 * maven - as a dependency manager & build tool
 * structure of maven (src/main+test)
 * the pomxml, which defines the structure of the maven project and contains information about external dependencies
 * mvnrepository, a online library of all open source maven projects
 * different stages of mvn lifecycle - eg validate, compile, test, package
 * getting Javalin into our projects
 */