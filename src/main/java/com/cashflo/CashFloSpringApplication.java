package com.cashflo;

import com.cashflo.model.State;
import com.cashflo.model.Student;
import com.cashflo.model.StudentsResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CashFloSpringApplication {
    private static List<Student> hmStudents;
    public StudentsResponse studentsResponse = new StudentsResponse();

    private void initStudents() {

        ArrayList<State> stateList1 = new ArrayList();
        ArrayList<State> stateList2 = new ArrayList();

        hmStudents = new ArrayList<Student>();

        State state1 = new State("ca", 93);
        State state2 = new State("ma", 94);
        stateList1.add(state1);
        stateList1.add(state2);
        Student stuOne = new Student("John", "math", stateList1);
        hmStudents.add(stuOne);

        State state3 = new State("az", 95);
        State state4 = new State("or", 96);
        stateList2.add(state3);
        stateList2.add(state4);
        Student stuTwo = new Student("Mark", "bio", stateList2);
        hmStudents.add(stuTwo);
        studentsResponse.setStudents(hmStudents);
        //test
    }

    public StudentsResponse getStudentsResponse() {
        return studentsResponse;
    }

    public void setStudentsResponse(StudentsResponse studentsResponse) {
        this.studentsResponse = studentsResponse;
    }

    public static void main(String[] args) {
        SpringApplication.run(CashFloSpringApplication.class, args);
    }
}
