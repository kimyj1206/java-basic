package Class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; // 아직 참조값을 대입하지 않았기에 각 요소는 참조값이 없다는 의미의 null 값으로 초기화
        students[0] = student1; // 자바에서의 대입은 항상 변수에 들어 있는 값을 복사
        students[1] = student2;

        // 배열에 들어있는 객체 사용 시 먼저 배열에 접근 후에 객체에 접근하면 됨
        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
    }
}
