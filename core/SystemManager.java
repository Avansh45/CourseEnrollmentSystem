package core;

import course.Course;
import java.util.*;

public class SystemManager {

    private static SystemManager instance;
    private List<Course> courses = new ArrayList<>();

    private SystemManager(){}

    public static SystemManager getInstance(){
        if(instance == null){
            instance = new SystemManager();
        }
        return instance;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> getCourses(){
        return courses;
    }
}
