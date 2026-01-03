package state;

import course.Course;

public class FullState implements CourseState {

    private Course course;

    public FullState(Course course){
        this.course = course;
    }

    public void enroll(){
        System.out.println("Course is full!");
    }
}
