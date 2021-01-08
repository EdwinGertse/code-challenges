package za.co.tegres.code.challenges.hackerrank;

import org.apache.commons.lang3.StringUtils;

/**
 * @author edwin.gertse
 */
public class QuestionMarks {

    private static final int TEN = 10;
    private static final int ASSERT_QUESTION_MARKS = 3;

    private static int startIndex = 0;
    private static int endIndex = 0;

    public static boolean hasThreeQuestionMarks(String rawData) {
        if (!hasRange(rawData))
            return false;

        char[] chars = rawData.substring(startIndex == 0 ? startIndex : startIndex + 1, endIndex + 1).toCharArray();
        int result = 0;
        for(char c : chars) {
            if (isQuestionMark(c))
                result++;
        }
        return result == ASSERT_QUESTION_MARKS;
    }

    private static boolean hasRange(String rawData) {

        int firstNumber = 0;
        int secondNumber = 0;
        boolean isfirstNumber = false;
        boolean isLastNumber = false;

        if (StringUtils.isBlank(rawData)) return false;

        char[] chars = rawData.toCharArray();
        int loopIndex = 0;
        for (char character : chars) {
            if(isNumber(character)) {
                if(!isfirstNumber) {
                    startIndex = loopIndex;
                    firstNumber = Integer.valueOf(Character.toString(character));
                    isfirstNumber = true;
                    continue;
                } else {
                    endIndex = loopIndex;
                    secondNumber = Integer.valueOf(Character.toString(character));
                    isLastNumber = true;
                }

                if (equalsTen(firstNumber, secondNumber)) {
                    break;
                } else {
                    isfirstNumber = false;
                    startIndex = loopIndex;
                    continue;
                }
            }
            loopIndex++;
        }
        return isfirstNumber && isLastNumber;
    }

    private static boolean isNumber(char a) {
        return Character.isDigit(a);
    }

    private static boolean isQuestionMark(char q) {
        String convertedString = String.valueOf(q);
        return convertedString.matches("\\?");
    }

    private static boolean equalsTen(int first, int second) {
        return first + second == TEN;
    }

}
