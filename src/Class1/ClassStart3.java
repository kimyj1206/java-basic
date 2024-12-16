package Class1;

public class ClassStart3 {

    public static void main(String[] args) {
        // new Student() : Student 클래스 정보를 기반으로 새로운 객체를 생성하라는 의미
        // 해당 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 것, 생성한 객체에 접근할 방법이 필요
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);

        // 참조값 확인 - @ 앞은 패키지 + 클래스 정보를 뜻함
        System.out.println(student1); // Class1.Student@5f184fc6
        System.out.println(student2); // Class1.Student@3feba861
    }
}
