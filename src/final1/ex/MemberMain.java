package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print(); // id: myId name: kim
        member.changeData("myId2", "seo");
        member.print(); // id: myId name: seo
    }
}
