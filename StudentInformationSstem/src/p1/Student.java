package p1;

public class Student {


    // variables
    String name,stuNo;
    int classes;
    double average;
    boolean isPass ;
    Course mat;
    Course phy;
    Course chem;

    Course quiz;




// Constructor method
    Student (String name , int classes, String stuNo, Course mat,Course phy,Course chem){
        this.name =name;
        this.classes=classes;
        this.stuNo =stuNo;
        this.mat=mat ;
        this.phy= phy;
        this.chem =chem ;
        calcAverage();
        this.isPass = false;
    }

    public void addExamNote(int mat ,int phy,int chem){

        if (mat >= 0 && mat <=100) this.mat.note = (int) (mat*0.8);
        if (phy >= 0 && phy <=100 ) this.phy.note = (int) (phy*0.8);
        if (chem >= 0 && chem <=100) this.chem.note = (int) (chem*0.8);

    }
    public void addQuizNote(int mat ,int phy,int chem) {

        if (mat >= 0 && mat <= 100) this.mat.note += (int) (mat * 0.2);
        if (phy >= 0 && phy <= 100) this.phy.note += (int) (phy * 0.2);
        if (chem >= 0 && chem <= 100) this.chem.note += (int) (chem * 0.2);
    }

    public void  isPass() {
        if (this.phy.note == 0 || this.mat.note == 0 || this.chem.note == 0) {
            System.out.println("Error adding note !");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average :" + this.average);
            if (this.isPass) {
                System.out.println("Course Passed ");
            } else {
                System.out.println("Course Failed .");
            }
        }
    }

        public void calcAverage () {
            this.average = (this.phy.note + this.chem.note + this.mat.note) / 3;
        }

        public boolean isCheckPass () {
            calcAverage();
            return this.average > 55;
        }

        public void printNote () {
            System.out.println("=========================");
            System.out.println("Student : " + this.name);
            System.out.println("Mat Note : " + this.mat.note);
            System.out.println("Physics Note : " + this.phy.note);
            System.out.println("Chemistry Note : " + this.chem.note);
        }
    }


