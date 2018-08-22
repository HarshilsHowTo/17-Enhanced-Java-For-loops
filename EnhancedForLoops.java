import java.util.*;

public class EnhancedForLoops {

    public static void main(String[] args) {

//        List<String> days = new ArrayList<>();
//        days.add("Monday");
//        days.add("Tuesday");
//        days.add("Wednesday");
//        days.add("Thursday");
//        days.add("Friday");
//
//        for (int i = 0; i < days.size(); i++) {
//            System.out.println(days.get(i));
//        }
//        System.out.println();
//        for (String day : days) {
//            System.out.println(day);
//        }

        Set<Integer> favNums = new HashSet<>();
        favNums.add(17);
        favNums.add(38);
        favNums.add(42);
        favNums.add(123);

//        for (int number : favNums) {
//            System.out.println(number);
//        }

        Map<Integer, Boolean> lieDetector = new HashMap<>();
        lieDetector.put(1,true);
        lieDetector.put(2,false);
        lieDetector.put(3,false);
        lieDetector.put(4,true);

        int counter = 0;
        for (Map.Entry<Integer,Boolean> answer : lieDetector.entrySet()) {
            counter += answer.getValue() ? 1 : 0;
        }
        System.out.println(counter);
    }

    private static int squareMyNumber (int number) {
        return number*number;
    }

}
