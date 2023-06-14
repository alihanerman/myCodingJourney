package p1;

public class Course {
    String name;
    String code;
    String prefix;
    int note ;
    Teacher courseTeacher;



    
    

    public Course (String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix= prefix;
        this.note = 0;
    }




    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher= t;
            System.out.println("Teacher added");

        }else System.out.println("This teacher can't take that course.");
    }
public void printTeacher(){
        if (courseTeacher !=null ){
            System.out.println(this.name + " is  your course Teacher. "+ courseTeacher.name);
        }else {
            System.out.println(this.name + "Course teacher doesn't exist.");
        }

}

}
