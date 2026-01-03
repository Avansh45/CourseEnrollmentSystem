import core.SystemManager;
import course.*;
import payment.*;
import enrollment.*;

public class Main {

    public static void main(String[] args) {

        SystemManager manager = SystemManager.getInstance();

        Course java = CourseFactory.createCourse("paid","Java Masterclass",2);
        manager.addCourse(java);

        EnrollmentService service = new EnrollmentService();

        PaymentStrategy payment = PaymentFactory.getPaymentMethod("upi");
        service.enrollStudent(java,payment);
        service.enrollStudent(java,payment);
        service.enrollStudent(java,payment);
    }
}
