public class Student {

    String firstName;
    String lastName;
    int expectedYearGrad;
    double gpa;
    String declaredMajor;

    public Student(String firstName, String lastName, int expectedYearGrad,
                   double gpa, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearGrad = expectedYearGrad;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedYearGrad = this.expectedYearGrad + 1;
    }
}
