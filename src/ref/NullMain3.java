package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // null -> BigData의 data 멤버 변수는 참조형이기에 null 값으로 초기화됨
        System.out.println("bigData.data.value = " + bigData.data.value); // NullPointerException 발생
    }
}
