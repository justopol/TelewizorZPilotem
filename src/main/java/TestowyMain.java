import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestowyMain {
    public static void main(String[] args) {
        System.out.println("print");
//        String str = "wwwbbbw";
//        int howManyRepeats = 0;
//        char toCompare = str.charAt(0);
//        String result = "";
//        for (int i = 1; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (toCompare==c){
//                howManyRepeats++;
//            }else{
//                howManyRepeats++;
//                result = result+howManyRepeats+toCompare;
//                toCompare = c;
//                howManyRepeats= 0;
//            }
//
//        }
//        howManyRepeats++;
//        result = result+howManyRepeats+toCompare;
//        System.out.println(result);

//        String str = "12:30PM-12:00AM";
//        String[] dateArray = str.split("-");
//        String firstDate = dateArray[0];
//        String secondDate = dateArray[1];
//        DateFormat dateFormat = new SimpleDateFormat("hh:mma");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mmhh");
//        LocalTime t1 = LocalTime.parse(firstDate, formatter);
//        /*LocalTime t2 = LocalTime.parse(secondDate, formatter);
//        int t1min = t1.getMinute();
//        int t2min = t2.getMinute();*/
//        try {
//            Date date1 = dateFormat.parse(firstDate);
//            Date date2 = dateFormat.parse(secondDate);
//            long difference = Math.abs(date1.getTime()-date2.getTime());
//            TimeUnit.MILLISECONDS.toMinutes(difference).S.;
//            int a = 0;
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


        int[] arr = new int[]{10, 12, 4, 5, 9};

        int bestProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentStock = arr[i];
            for (int j = i; j < arr.length; j++) {
                int stock = arr[j];
                if (bestProfit < stock - currentStock) {
                    bestProfit = stock - currentStock;
                }
            }
        }
    }
}
