package ru.stepup;

public class Sum1 {
    public static void main(String[] args) {
        double totalSum = 0.0; 
        for (int i=0; i<args.length;i++) {
            if (!args[i].matches("^-?\\d+$"))  {
                System.out.println(args[i] + " �� �������� ������");}
            else  {
                double number = Double.parseDouble(args[i]);
                totalSum += number;
            }

        }

        System.out.println("�����: " + totalSum);
    }
}