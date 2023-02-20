package klasy_kurs.zadanie1.zadanie2;

public class Array {
    private int[] array;

    public int SumAllElememts() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int countMean() {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = (sum + array[i]) / i;
//        }
//        return sum;
        return SumAllElememts()/array.length;
    }

    public int minValueOfArray() {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public int maxValueOfArray() {
        int maxValue= array[0];
        for (int i = 1; i<array.length;i++){
            if (maxValue<array[i]){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public Array(int[]array){
        this.array = array;
    }

}
