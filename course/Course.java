package course;

import state.CourseState;
import state.AvailableState;

public abstract class Course {

    protected String name;
    protected int capacity;
    protected int enrolled;
    protected CourseState state;

    public Course(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.state = new AvailableState(this);
    }

    public void enroll(){
        state.enroll();
    }

    public void setState(CourseState state){
        this.state = state;
    }

    public boolean isFull(){
        return enrolled >= capacity;
    }

    public void increaseEnrollment(){
        enrolled++;
    }

    public String getName(){
        return name;
    }
}
