package org.example;


import java.sql.Time;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {

    public static String printSomething(String text)
    {
        System.out.println(text);
        return "result";
    }

    public static int calculateSomething(int number)
    {

        return  number + 10;
    }

    public static String makeSomething(int number)
    {
        if (number > 10)
        {
            return "true";
        }
            else {
                return "false";
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future result1;
        Future result2;
        Future result3;

        result1 = Timer.setTimerForFunc(5, "wow", Main::printSomething);
        result2 = Timer.setTimerForFunc(5, 10, Main::calculateSomething);
        result3 = Timer.setTimerForFunc(5, 11, Main::makeSomething);

        System.out.println(result1.get());
        System.out.println(result2.get());
        System.out.println(result3.get());

    }
}