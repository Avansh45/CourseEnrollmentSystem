package course;

public class CourseFactory {

    public static Course createCourse(String type, String name, int capacity){
        if(type.equalsIgnoreCase("free"))
            return new FreeCourse(name, capacity);
        else
            return new PaidCourse(name, capacity);
    }
}
