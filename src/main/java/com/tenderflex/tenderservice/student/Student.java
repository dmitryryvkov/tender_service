package com.tenderflex.tenderservice.student;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Student {
    @Getter
    private final Integer studentId;
    @Getter
    private final String studentName;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}






