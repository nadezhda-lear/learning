package edu.innotech;


import java.lang.reflect.Method;

public class MainApp {

    public static void main(String[] args)  {
        System.out.println("HW");
        Student st = new Student("pete");
        st.addGrade(5);
        st.addGrade(4);
        st.addGrade(5);
        System.out.println(st);
    }


}