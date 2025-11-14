class Student {
    String name;
    int rollNumber;
    double marks;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    void calculateGrade() {
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Harsha";
        s1.rollNumber = 101;
        s1.marks = 85.5;

        s1.displayInfo();
        s1.calculateGrade();
    }
}