package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    Scanner input = new Scanner(System.in);
    Queue <String> queue = new LinkedList<>();
    boolean running = true;

    public static void main(String[] args)
    {
        TaskHelper helper = new TaskHelper();
        helper.run();
    }

    public void run()
    {

        System.out.println("Please enter one of the following commands.");
        System.out.println("\"add\" to add a task name.");
        System.out.println("\"peek\" to print out a task name.");
        System.out.println("\"remove\" to remove the first added task.");
        System.out.println("\"amount\" to print out the number of tasks.");
        System.out.println("\"flee\" to skip town and delete all the tasks.");
        System.out.println("\"exit\" to end the program.");

        while (running)
        {
            System.out.println("------------------------------------------------");
            System.out.println("Please enter a command.");
            System.out.println("------------------------------------------------");
            String commands = input.next();
            switch (commands)
            {
                case "add":
                    addTaskName();
                    break;
                case "peek":
                    peek();
                    break;
                    default:
                case "remove":
                    remove();
                    break;
                case "amount":
                    printAmount();
                    break;
                case "flee":
                    flee();
                    break;
                case "exit":
                    exit();
                    break;
            }
        }
    }

    public void addTaskName()
    {
        String taskName = input.next();
        queue.add(taskName);
        System.out.println(taskName + " added to task list");
    }

    public void peek()
    {
        if (queue.size() > 0)
        {
            System.out.println(queue.peek());
        }
        else
        {
            System.out.println("There is nothing on the task list.");
        }
    }

    public void remove()
    {
        System.out.println(queue.peek() + " has been removed from the task list.");
        queue.remove();
    }

    public void printAmount()
    {
        if (queue.size() > 1)
        {
            System.out.println(queue.size() + " tasks remaining");
        }
        else if (queue.size() == 1)
        {
            System.out.println(queue.size() + " task remaining");
        }
        else
        {
            System.out.println("There is nothing on the task list.");
        }
    }

    public void flee()
    {
        System.out.println("Deleting all evidence of hopes and dreams.");
        queue.clear();
        System.out.println("No more tasks left.");
    }

    public void exit()
    {
        running = false;
        System.out.println("Terminating program.");
        System.out.println("Program terminated.");
        System.out.println("Thank you for using the Task List.");
    }
}
