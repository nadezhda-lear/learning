package ru.stepup;

import java.io.File;
import java.util.Scanner;

public class divide {

    public static int divide(String fileName) throws OperationAttemptException {
        File f = null ;
        Scanner sc = null;
        try {
           f = new File(fileName);
           sc = new Scanner(f);
           return sc.nextInt() / sc.nextInt();
       }catch ( Exception  exception){
            throw new OperationAttemptException("Ошибка при работе с файлом: " + exception.getMessage());
            }
       finally {
            if (sc != null)   sc.close();
       }
    }

}
