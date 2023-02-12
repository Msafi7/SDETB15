package class16;

public class StudentTester {
    public static void main(String[] args) {
        //Creating object for student class

        Student student=new Student();
        student.name="Zafar";
        student.id="123";
        student.schoolName="Syntax";
        student.age=22;
        student.weight=70;

        Student student1=new Student();
        student1.name="Hamid";
        student1.id="1234";
        student1.schoolName="Syntax";
        student1.age=24;
        student1.weight=75;

        Student student2=new Student();
        student2.name="Zafar";
        student2.id="123";
        student2.schoolName="Syntax";
        student2.age=22;
        student2.weight=70;
        System.out.println(student2.name);
        System.out.println(Student.schoolName);//Static Variable can also be accessed by Class .
        System.out.println(student2.schoolName);

    }
}
