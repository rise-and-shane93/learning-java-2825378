public class Main {

    public static void main(String[] args) {

        Student shane = new Student("Shane", "Harper",
                2024, 4, "Computer Science");
        Student seth = new Student("Seth", "Harper",
                2022, 4, "Sociology");

        seth.incrementExpectedGraduationYear();
        System.out.println(seth.expectedYearGrad);

    }

}
