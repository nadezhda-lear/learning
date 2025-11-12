package edu.innotech;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Matches;

import org.hamcrest.Matcher.*;

import java.util.ArrayList;
import java.util.Arrays;


public class StudentTests {

    private Student student;


    @Test
    public void CheckPositiveGrade() {
        Student stud = new Student("Lera");
        stud.setRepo(new StudentRepositoryMock());
        stud.addGrade(4);
        Assertions.assertEquals(stud.getGrades(), new ArrayList<>(Arrays.asList(4)));
    }

    @Test
    public void CheckNegativeGrade() {
        Student stud = new Student("Lera");
        stud.setRepo(new StudentRepositoryMock());
        stud.addGrade(7);
        Assertions.assertEquals(stud.getGrades(), new ArrayList<>(Arrays.asList(4)));
    }

    @Test
    public void testRaiting() {
        Student stud = new Student("Lera");
        stud.addGrade(4);
        stud.setRepo(new StudentRepositoryMock());
        Assertions.assertEquals(stud.raiting(), 10);
    }

    @Test
    public void myTest() {
        int id = 1;
        RestAssured.given()
                .baseUri("http://localhost:8080/student/"+id)
                .contentType(ContentType.JSON)
                .when().get().then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id", Matchers.equalTo(id));
    }
    @Test
    //post /student обновляет студента в базе, если студент с таким ID ранее был, при этом имя заполнено, код 201.
    public  void myTest4(){
        RestAssured.given()
                .baseUri("http://localhost:8080/student/")
                .contentType(ContentType.JSON)
                .when()
                .post("ID","pete")
                .then()
                .statusCode(201);

    }
}
