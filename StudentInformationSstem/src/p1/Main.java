package p1;

public class Main {
    public static void main(String[] args) {


        Course mat = new Course("Mathematics", "MAT101", "MAT");
        Course phy = new Course("Physics", "PHY101", "PHY");
        Course chem = new Course("Chemistry", "CHEM101", "CHEM");
        Teacher t1 = new Teacher("Bruce Banner", "90550000000", "MAT");
        Teacher t2 = new Teacher("Tony Stark", "90550000001", "PHY");
        Teacher t3 = new Teacher("Walter White", "90550000002", "CHEM");


        mat.addTeacher(t1);
        phy.addTeacher(t2);
        chem.addTeacher(t3);
        Student s1 = new Student(" Scarlet Widow", 4, "140144015", mat, phy, chem);
        s1.addExamNote(50,20,40);
        s1.addQuizNote(20,20,20);
        s1.isPass();

        Student s2 = new Student("Jonny Bravo", 4, "2211133", mat, phy, chem);
        s2.addExamNote(100,50,40);

        s2.isPass();

        Student s3 = new Student("Morty Santos", 4, "221121312", mat, phy, chem);
        s3.addExamNote(50,20,40);

        s3.isPass();

    }
}