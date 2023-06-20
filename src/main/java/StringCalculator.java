public class StringCalculator {
    public static int add(String numbers) throws Exception{
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    int temp = Integer.parseInt(number.trim());
                    if(temp < 0) {
                        throw new Exception("Negatives not allowed.");
                    }
                    if(temp >= 1000) {
                        temp = 0;
                    }
                    returnValue+=temp; // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;

    }
}
