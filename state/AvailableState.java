package state;

import course.Course;

public class AvailableState implements CourseState {

    private Course course;

    public AvailableState(Course course){
        this.course = course;
    }

    public void enroll(){
        course.increaseEnrollment();
        System.out.println("Enrollment successful!");

        if(course.isFull()){
            course.setState(new FullState(course));
        }
    }
}
