import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
List<Integer> digitList = getDigitList(numberToCheck);
        List<Double> digit = digitList.stream()
            .map(e->Math.pow(e,digitList.size()))
            . collect (Collectors.toList());
        Double sum = digit.stream().reduce(0.0,(a,b)->a+b);
        return sum.equals(Double.valueOf(numberToCheck));
    }
    private List<Integer> getDigitList(int num){
        return Arrays.stream(String.valueOf(num).split("")).map(e->Integer.parseInt(e)).collect(Collectors.toList());
    }

}
