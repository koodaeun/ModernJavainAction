package basic.section08.koo;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("test");
        member.print();
    }
}
