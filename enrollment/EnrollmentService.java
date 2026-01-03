package enrollment;

import course.Course;
import payment.PaymentStrategy;

public class EnrollmentService {

    public void enrollStudent(Course course, PaymentStrategy payment){
        payment.pay();
        course.enroll();
    }
}
