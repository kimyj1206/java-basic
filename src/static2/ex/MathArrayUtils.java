package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // 인스턴스 생성 막음
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int e : array) {
            sum += e;
        }
        return sum;
    }

    public static double average(int[] array) {
//        int sum = 0;
//        for (int e : array) {
//            sum += e;
//        }
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int e : array) {
            if (e < minValue) {
                minValue = e;
            }
        }
        return minValue;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int e : array) {
            if (e > maxValue) {
                maxValue = e;
            }
        }
        return maxValue;
    }

}
