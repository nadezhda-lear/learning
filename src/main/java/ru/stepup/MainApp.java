package ru.stepup;

public class MainApp {

    public static void main(String[] args)  {
      String fileName = "C:\\Users\\nvasileva\\IdeaProjects\\learning\\src\\main\\java\\ru\\stepup\\new 11.txt";
      int i = 0 ;
      try {
          i = divide.divide(fileName);
      } catch (OperationAttemptException exception)
        {System.out.println(exception.getMessage());}
        System.out.println(i);
    }

}