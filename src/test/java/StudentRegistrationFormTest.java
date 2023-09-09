import org.junit.jupiter.api.Test;
import pages.StudentRegistrationFormPage;

public class StudentRegistrationFormTest extends TestBase {
    public String firstName = "Petr";
    public String lastName = "Petrov";
    public String email = "Pert@mail.com";
    public String gender = "Male";
    public String number = "1223456789";
    public String month = "March";
    public String year = "1917";
    public String day = "15";
    public String subjects = "Arts";
    public String hobbies = "Music";
    public String photo = "photo_1.png";
    public String address = "The city of Moscow";
    public String selectState = "NCR";
    public String selectCity = "Delhi";

    StudentRegistrationFormPage studentRegistrationForm = new StudentRegistrationFormPage();

    @Test
    void successfulRegistrationWithRequiredFieldsTest() {
        studentRegistrationForm
                .openPage()
                .checkThatTheSiteHasOpened("Student Registration Form")
                .closeBanners()
                .setRequiredFields(firstName,
                        lastName,
                        gender,
                        number,
                        day,
                        month,
                        year)
                .clickSubmit()
                .checkThatTheTableHasOpened("Thanks for submitting the form")
                .checkResultRequiredFields(firstName,
                        lastName,
                        gender,
                        number,
                        day,
                        month,
                        year)
                .clickClose();
    }

    @Test
    void successfulRegistrationWithAllFieldsTest() {
        studentRegistrationForm
                .openPage()
                .checkThatTheSiteHasOpened("Student Registration Form")
                .closeBanners()
                .setAllFields(firstName,
                        lastName,
                        email,
                        gender,
                        number,
                        day,
                        month,
                        year,
                        subjects,
                        hobbies,
                        photo,
                        address,
                        selectState,
                        selectCity)
                .clickSubmit()
                .checkThatTheTableHasOpened("Thanks for submitting the form")
                .checkResultAllFields(firstName,
                        lastName,
                        email,
                        gender,
                        number,
                        day,
                        month,
                        year,
                        subjects,
                        hobbies,
                        photo,
                        address,
                        selectState,
                        selectCity)
                .clickClose();
    }
}