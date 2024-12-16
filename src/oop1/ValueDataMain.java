package oop1;

/**
 * ValueData 인스턴스를 생성해 외부에서 ValueData.value에 접근해 숫자를 하나씩 증가
 */
public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valueData =  new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자: " + valueData.value);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
