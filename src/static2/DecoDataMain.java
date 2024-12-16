package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall(); // staticValue=1

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall(); // instanceValue=1, staticValue=2

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall(); // instanceValue=1, staticValue=3

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        staticCall(); // staticValue=4

        // 클래스를 통한 접근
//        DecoData.staticCall();
        staticCall(); // staticValue=5
    }
}
